package com.contactmanage.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.contactmanage.model.Contact;
@Repository
public interface ContactRepo extends JpaRepository<Contact, Integer> {

}
