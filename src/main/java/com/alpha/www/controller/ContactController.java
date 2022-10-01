package com.alpha.www.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.alpha.www.dto.ContactDTO;
import com.alpha.www.entity.Contact;
import com.alpha.www.service.ContactService;

@RestController
public class ContactController {
	
	@Autowired
	private ContactService contactService;

	@PostMapping("/contact")
	public ResponseEntity<Contact> saveContact(@RequestBody ContactDTO contactDTO) {
		return ResponseEntity.ok(contactService.saveContact(contactDTO));
	}

	@GetMapping("/contact/{id}")
	public ResponseEntity<ContactDTO> getContactById(@PathVariable Long id) {
		return ResponseEntity.ok(contactService.getContactById(id));
	}

	@GetMapping("/contacts")
	public ResponseEntity<List<ContactDTO>> getContactList() {
		return ResponseEntity.ok(contactService.getContactList());
	}

}
