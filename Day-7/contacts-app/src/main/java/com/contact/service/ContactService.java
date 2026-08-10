package com.contact.service;

import java.util.List;

import com.contact.dto.ContactRequestDTO;
import com.contact.dto.ContactResponseDTO;

public interface ContactService {

    ContactResponseDTO createContact(ContactRequestDTO request);

    List<ContactResponseDTO> getAllContacts();

    ContactResponseDTO getContactById(Long id);

    ContactResponseDTO updateContact(Long id, ContactRequestDTO request);

    void deleteContact(Long id);
}