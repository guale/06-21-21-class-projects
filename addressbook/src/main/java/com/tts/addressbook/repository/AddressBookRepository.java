package com.tts.addressbook.repository;

import com.tts.addressbook.module.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AddressBookRepository extends JpaRepository<Address, Long> {
	List<Address> findAllByOrderByFirstName();
	List<Address> findAllByFirstNameIgnoreCaseContainingOrderByFirstName(String query);
	List<Address> findAllByLastNameIgnoreCaseContainingOrderByFirstName(String query);
	List<Address> findAllByPhoneNumberContainingOrderByFirstName(String query);
	List<Address> findAllByEmailAddressIgnoreCaseContainingOrderByFirstName(String query);
	List<Address> findAllByFirstNameIgnoreCaseStartsWithOrderByFirstName(char letter);
}
