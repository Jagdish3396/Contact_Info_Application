package com.contactmanage.service;

import java.util.List;
import java.util.Optional;

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
		List<Contact> list = contactRepo.findAll();
		return list;
	}

	@Override
	public Contact getContactById(Integer id) {
		Optional<Contact> contact = contactRepo.findById(id);
		if (contact.isPresent()) {
			Contact c = contact.get();
			return c;
			
		}
		return null;
	}

	@Override
	public boolean updateContact(Contact contact) {
	Contact save = contactRepo.save(contact);
	if(save!=null)
		return true;
	else
		return false;
	}

}
