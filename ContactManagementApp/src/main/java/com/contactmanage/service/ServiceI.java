package com.contactmanage.service;

import java.util.List;

import com.contactmanage.model.Contact;

public interface ServiceI {
	public boolean saveContact(Contact contact);
	public List<Contact> getAllContact();
	public Contact getContactById(Integer id);
	public boolean updateContact(Contact contact );
	
}
