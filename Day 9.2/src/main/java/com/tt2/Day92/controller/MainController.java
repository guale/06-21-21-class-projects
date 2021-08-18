package com.tt2.Day92.controller;

import com.tt2.Day92.model.Customer;
import com.tt2.Day92.repsitory.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.Random;

@RestController
public class MainController {

	@Autowired
	CustomerRepository customerRepository;

/*	@GetMapping("/")
	public String getHome(){
		return "Hello World";
	}*/

	@GetMapping("/random")
	public Integer getRandomInteger(){
		Random random = new Random();
		return random.nextInt(1000);
	}

	@GetMapping("/customer/all")
	public List<Customer> getAllCustomer(){
		return(List<Customer>) customerRepository.findAll();
	}

	@GetMapping("/customer/{id}")
	public Optional<Customer> getCustomerById(@PathVariable Long id){
		return customerRepository.findById(id);
	}

}
