package com.tts.addressbook.controller;

import com.tts.addressbook.module.Address;
import com.tts.addressbook.repository.AddressBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AddressBookController {

	@Autowired
	private AddressBookRepository addressBookRepository;

	@GetMapping("/")
	public String index(Address address, Model model) {
		model.addAttribute("entries", addressBookRepository.findAll());
		return "address/index";
	}

	@PostMapping("/add")
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


}
