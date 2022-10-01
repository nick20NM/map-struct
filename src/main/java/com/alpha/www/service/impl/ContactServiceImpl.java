package com.alpha.www.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alpha.www.dto.ContactDTO;
import com.alpha.www.entity.Contact;
import com.alpha.www.mapper.ContactMapper;
import com.alpha.www.repository.ContactRepository;
import com.alpha.www.service.ContactService;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactRepository contactRepository;

	@Autowired
	private ContactMapper contactMapper;

	public Contact saveContact(ContactDTO contactDTO) {

		/*
		 * Contact contact = new Contact();
		 * contact.setFirstName(contactDTO.getFirstName());
		 * contact.setLastName(contactDTO.getLastName());
		 * contact.setEmail(contactDTO.getEmail());
		 * contact.setPhoneNo(contactDTO.getPhoneNo());
		 * 
		 * return contactRepository.save(contact);
		 */
		return contactRepository.save(contactMapper.DtoToEntity(contactDTO));
	}

	public ContactDTO getContactById(Long id) {

		/*
		 * Optional<Contact> contact = contactRepository.findById(id); ContactDTO
		 * contactDTO = new ContactDTO(); if(contact.isPresent()) {
		 * 
		 * contactDTO.setId(id); contactDTO.setFirstName(contact.get().getFirstName());
		 * contactDTO.setLastName(contact.get().getLastName());
		 * contactDTO.setEmail(contact.get().getEmail());
		 * contactDTO.setPhoneNo(contact.get().getPhoneNo()); }
		 * 
		 * return contactDTO;
		 */

		return contactRepository.findById(id).map(contactMapper::EntityToDTO).orElse(new ContactDTO());

	}

	public List<ContactDTO> getContactList() {

		/*
		 * return contactRepository.findAll().stream().map(contact ->{
		 * 
		 * ContactDTO contactDTO = new ContactDTO(); contactDTO.setId(contact.getId());
		 * contactDTO.setFirstName(contact.getFirstName());
		 * contactDTO.setLastName(contact.getLastName());
		 * contactDTO.setEmail(contact.getEmail());
		 * contactDTO.setPhoneNo(contact.getPhoneNo()); return contactDTO ;
		 * }).collect(Collectors.toList());
		 */

		List<Contact> contacts = contactRepository.findAll();
		return contactMapper.EntityListToDTOList(contacts);

	}

}
