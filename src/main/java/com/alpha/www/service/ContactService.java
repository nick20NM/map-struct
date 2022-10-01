package com.alpha.www.service;

import java.util.List;

import com.alpha.www.dto.ContactDTO;
import com.alpha.www.entity.Contact;

public interface ContactService {
	Contact saveContact(ContactDTO contactDTO);
	ContactDTO getContactById(Long id);
	List<ContactDTO> getContactList();
}
