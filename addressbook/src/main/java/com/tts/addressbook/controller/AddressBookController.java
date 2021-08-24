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

@Controller
public class AddressBookController {

	@Autowired
	private AddressBookRepository addressBookRepository;

	@GetMapping("/")
	public String index(Address address, Model model) {
		List<Address> addresses = addressBookRepository.findAll(Sort.by(Sort.Direction.ASC, "firstName"));
		model.addAttribute("entries", addresses);
		return "address/index";
	}

	@PostMapping("/addresses")
	public String addNewAddress(Address address, Model model) {
		if (!address.getMiddleName().equals(null)) {
			address.setFullName(address.getFirstName() + " " + address.getMiddleName() + " " + address.getLastName());
		} else {
			address.setFullName(address.getFirstName() + " " + address.getLastName());
		}
		addressBookRepository.save(address);

		model.addAttribute("firstName", address.getFirstName());
		model.addAttribute("middleName", address.getMiddleName());
		model.addAttribute("lastName", address.getLastName());
		model.addAttribute("fullName", address.getFullName());
		model.addAttribute("phoneNumber", address.getPhoneNumber());
		model.addAttribute("emailAddress", address.getEmailAddress());
		model.addAttribute("comment", address.getComment());
		return "address/result";
	}

	@GetMapping("/addresses/new")
	public String newAddress(Address address){
		return "address/new";
	}

	@GetMapping("/addresses/{id}")
	public String editPostById(@PathVariable Long id, Address address, Model model) {
		model.addAttribute("address", addressBookRepository.findById(id).orElseThrow());
		return("address/edit");
	}

	@PostMapping("/addresses/update/{id}")
	public String updateExistingAddress(@PathVariable Long id, Address address, Model model) {
		var workingAddress = addressBookRepository.findById(id).orElseThrow();
		workingAddress.setFirstName(address.getFirstName());
		workingAddress.setMiddleName(address.getMiddleName());
		workingAddress.setLastName(address.getLastName());
		workingAddress.setPhoneNumber(address.getPhoneNumber());
		workingAddress.setEmailAddress(address.getEmailAddress());
		workingAddress.setComment(address.getComment());
		if (!address.getMiddleName().equals(null)) {
			address.setFullName(address.getFirstName() + " " + address.getMiddleName() + " " + address.getLastName());
		} else {
			address.setFullName(address.getFirstName() + " " + address.getLastName());
		}
		addressBookRepository.save(address);
		model.addAttribute("address", workingAddress);
		return "address/result";
	}

	@RequestMapping("/addresses/delete/{id}")
	public String deleteAddress(@PathVariable Long id, Address address){
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
				model.addAttribute("entries", addressBookRepository.findAllByFirstNameContainingOrderByFirstName(query));
				break;
			case("lastName"):
				model.addAttribute("entries", addressBookRepository.findAllByLastNameContainingOrderByFirstName(query));
				break;
			case("phoneNumber"):
				model.addAttribute("entries", addressBookRepository.findAllByPhoneNumberContainingOrderByFirstName(query));
				break;
			case("emailAddress"):
				model.addAttribute("entries", addressBookRepository.findAllByEmailAddressContainingOrderByFirstName(query));
				break;
		}
		model.addAttribute("field", field);
		model.addAttribute("query", query);
		return "address/search";
	}

	@RequestMapping("/addresses/tabs/{letter}")
	public String filterByTab(@PathVariable char letter, Model model){
		model.addAttribute("entries", addressBookRepository.findAllByFirstNameStartsWithOrderByFirstName(letter));
		return "address/search";
	}
}
