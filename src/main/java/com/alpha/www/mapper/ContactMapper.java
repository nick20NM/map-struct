package com.alpha.www.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.alpha.www.dto.ContactDTO;
import com.alpha.www.entity.Contact;


/*Basic Mappings*/
@Mapper(componentModel = "spring")
public interface ContactMapper {

	Contact DtoToEntity(ContactDTO contactDTO);

	ContactDTO EntityToDTO(Contact contact);

	List<ContactDTO> EntityListToDTOList(List<Contact> contacts);

}
