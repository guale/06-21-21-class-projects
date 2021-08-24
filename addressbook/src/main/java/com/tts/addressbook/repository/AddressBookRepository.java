package com.tts.addressbook.repository;

import com.tts.addressbook.module.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AddressBookRepository extends JpaRepository<Address, Long> {
}
