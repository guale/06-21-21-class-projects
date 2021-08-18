package com.tt2.Day92;

import com.tt2.Day92.model.Customer;
import com.tt2.Day92.repsitory.CustomerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	private static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public CommandLineRunner demo(CustomerRepository customerRepository){
		return (args) -> {
			customerRepository.save(new Customer("Michael", "Smith"));
			customerRepository.save(new Customer("Aaron", "Moon"));
			customerRepository.save(new Customer("Jimmy", "Smits"));
		};
	}

}
