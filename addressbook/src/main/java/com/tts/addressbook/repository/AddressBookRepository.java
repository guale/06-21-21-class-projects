package com.tts.addressbook.repository;

import com.tts.addressbook.module.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressBookRepository extends CrudRepository<Address, Long> {
}
