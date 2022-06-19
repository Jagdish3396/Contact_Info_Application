package com.contactmanage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.contactmanage.model.Contact;
import com.contactmanage.repository.ContactRepo;

@Service
public class ServiceImpl implements ServiceI {
	@Autowired
	private ContactRepo contactRepo;

	@Override
	public boolean saveContact(Contact contact) {
		Contact save = contactRepo.save(contact);
		if (save != null) {
			return true;
		} else
			return false;
	}

	@Override
	public List<Contact> getAllContact() {
		List<Contact> all = contactRepo.findAll();
		return all;
	}

}
