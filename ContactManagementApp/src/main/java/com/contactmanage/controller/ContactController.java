package com.contactmanage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.contactmanage.model.Contact;
import com.contactmanage.service.ServiceI;

@RestController
@RequestMapping("/contactManage")
public class ContactController {
	@Autowired
	private ServiceI serviceI;

	@PostMapping(value = "/save", consumes = "APPLICATION/JSON")
	public ResponseEntity<String> saveContact(@RequestBody Contact contact) {
		System.out.println(contact);
		boolean saveContact = serviceI.saveContact(contact);

		if (saveContact == true) {
			String msg = "Contact Saved successfully";
			return new ResponseEntity<String>(msg, HttpStatus.CREATED);
		} else {

			String msg1 = "Contact not saved successfully";
			return new ResponseEntity<String>(msg1, HttpStatus.BAD_REQUEST);
		}
	}

	@GetMapping(value = "/getAllContact", produces = "APPLICATION/JSON")
	public ResponseEntity<List<Contact>> getAllUser() {
		List<Contact> list = serviceI.getAllContact();
		System.out.println(list);
		if (!list.isEmpty()) {
			return new ResponseEntity<List<Contact>>(list, HttpStatus.OK);

		} else {
			String msg = "No Data found";

			return new ResponseEntity(msg, HttpStatus.BAD_REQUEST);
		}

	}

	@GetMapping("/getContactById/{id}")
	public ResponseEntity<Contact> getContactById(@PathVariable Integer id) {
		Contact contact = serviceI.getContactById(id);
		if (contact != null)
			return new ResponseEntity<Contact>(contact, HttpStatus.OK);
		else {
			String msg = "No data found";
			return new ResponseEntity(msg, HttpStatus.BAD_REQUEST);
		}
	}

	@PutMapping("/updateContact")
	public ResponseEntity<String> updateContact(@RequestBody Contact contact) {
		boolean update = serviceI.updateContact(contact);
		if (update == true) {
			return new ResponseEntity<String>("Contact Updated successfully", HttpStatus.OK);
		} else {
			return new ResponseEntity<String>("Contact Not Updated", HttpStatus.BAD_REQUEST);
		}

	}

}
