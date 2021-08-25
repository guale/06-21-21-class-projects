package com.tts.addressbook.controller;

import com.tts.addressbook.module.Address;
import com.tts.addressbook.repository.AddressBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import static com.tts.addressbook.service.PhoneNumberServices.*;

@Controller
public class AddressBookController {

	@Autowired
	private AddressBookRepository addressBookRepository;

	@GetMapping("/")
	public String index(Model model) {
		List<Address> addresses = addressBookRepository.findAllByOrderByFirstName();

		addresses.forEach(e -> e.setPhoneNumber(formatPhoneNumber(e.getPhoneNumber())));

		model.addAttribute("entries", addresses);
		return "address/index";
	}

	@PostMapping("/addresses")
	public String addNewAddress(Address address) {
		if (!address.getMiddleName().equals(null)) {
			address.setFullName(address.getFirstName() + " " + address.getMiddleName() + " " + address.getLastName());
		} else {
			address.setFullName(address.getFirstName() + " " + address.getLastName());
		}

		address.setPhoneNumber(convertToNumbers(address.getPhoneNumber()));

		addressBookRepository.save(address);

		address.setPhoneNumber(formatPhoneNumber(address.getPhoneNumber()));

		return "address/result";
	}

	@GetMapping("/addresses/new")
	public String newAddress(Address address){
		return "address/new";
	}

	@GetMapping("/addresses/{id}")
	public String editPostById(@PathVariable Long id, Model model) {
		Address address = addressBookRepository.findById(id).orElseThrow();
		address.setPhoneNumber(formatPhoneNumber(address.getPhoneNumber()));
		model.addAttribute("address", address);
		return("address/edit");
	}

	@PostMapping("/addresses/update/{id}")
	public String updateExistingAddress(Address address) {
		if (!address.getMiddleName().equals(null)) {
			address.setFullName(address.getFirstName() + " " + address.getMiddleName() + " " + address.getLastName());
		} else {
			address.setFullName(address.getFirstName() + " " + address.getLastName());
		}

		address.setPhoneNumber(convertToNumbers(address.getPhoneNumber()));

		addressBookRepository.save(address);

		address.setPhoneNumber(formatPhoneNumber(address.getPhoneNumber()));

		return "address/result";
	}

	@RequestMapping("/addresses/delete/{id}")
	public String deleteAddress(@PathVariable Long id){
		addressBookRepository.deleteById(id);
		return "address/delete";
	}

	@GetMapping("/addresses/clear")
	public String clear(){
		return "address/clear";
	}

	@RequestMapping("/addresses/clearAll")
	public String clearAll(){
		addressBookRepository.deleteAll();
		return "address/clearConfirm";
	}

	@RequestMapping("/addresses/search")
	public String indexWithQuery(@RequestParam("query") String query, @RequestParam("field") String field, Model model){
		switch(field){
			case("firstName"):
				model.addAttribute("entries", addressBookRepository.findAllByFirstNameIgnoreCaseContainingOrderByFirstName(query));
				break;
			case("lastName"):
				model.addAttribute("entries", addressBookRepository.findAllByLastNameIgnoreCaseContainingOrderByFirstName(query));
				break;
			case("phoneNumber"):
				query=convertToNumbers(query);
				model.addAttribute("entries", addressBookRepository.findAllByPhoneNumberContainingOrderByFirstName(query));
				break;
			case("emailAddress"):
				model.addAttribute("entries", addressBookRepository.findAllByEmailAddressIgnoreCaseContainingOrderByFirstName(query));
				break;
		}
		model.addAttribute("field", field);
		model.addAttribute("query", query);
		return "address/search";
	}

	@RequestMapping("/addresses/tabs/{letter}")
	public String filterByTab(@PathVariable char letter, Model model){
		model.addAttribute("entries", addressBookRepository.findAllByFirstNameIgnoreCaseStartsWithOrderByFirstName(letter));
		return "address/search";
	}

	@ModelAttribute
	public void addAttribute(Model model){
		List alphabet = new ArrayList();
		for (int i = 0; i < 26; i++){
			alphabet.add((char)('A'+i));
		}

		model.addAttribute("alphabet",alphabet);

	}
}
