package com.contact.mapper;

import org.springframework.stereotype.Component;

import com.contact.dto.ContactRequestDTO;
import com.contact.dto.ContactResponseDTO;
import com.contact.entity.Contact;

@Component
public class ContactMapper {

    public Contact toEntity(ContactRequestDTO request) {

        Contact contact = new Contact();

        contact.setFirstName(request.getFirstName());
        contact.setLastName(request.getLastName());
        contact.setEmail(request.getEmail());
        contact.setPhone(request.getPhone());
        contact.setAltPhone(request.getAltPhone());

        return contact;
    }

    public ContactResponseDTO toResponseDTO(Contact contact) {

        ContactResponseDTO response = new ContactResponseDTO();

        response.setId(contact.getId());
        response.setFirstName(contact.getFirstName());
        response.setLastName(contact.getLastName());
        response.setEmail(contact.getEmail());
        response.setPhone(contact.getPhone());
        response.setAltPhone(contact.getAltPhone());

        // Favourite status
        response.setFavourite(contact.isFavourite());

        return response;
    }

    public void updateEntity(Contact contact, ContactRequestDTO request) {

        contact.setFirstName(request.getFirstName());
        contact.setLastName(request.getLastName());
        contact.setEmail(request.getEmail());
        contact.setPhone(request.getPhone());
        contact.setAltPhone(request.getAltPhone());
    }
}