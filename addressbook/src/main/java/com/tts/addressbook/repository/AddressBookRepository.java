package com.tts.addressbook.repository;

import com.tts.addressbook.module.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AddressBookRepository extends JpaRepository<Address, Long> {
	List<Address> findAllByFirstNameContainingOrderByFirstName(String query);
	List<Address> findAllByLastNameContainingOrderByFirstName(String query);
	List<Address> findAllByPhoneNumberContainingOrderByFirstName(String query);
	List<Address> findAllByEmailAddressContainingOrderByFirstName(String query);
	List<Address> findAllByFirstNameStartsWithOrderByFirstName(char letter);
}
