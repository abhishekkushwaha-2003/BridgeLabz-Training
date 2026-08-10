package com.contact.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.contact.dto.ContactRequestDTO;
import com.contact.dto.ContactResponseDTO;
import com.contact.entity.Contact;
import com.contact.exception.ContactNotFoundException;
import com.contact.mapper.ContactMapper;
import com.contact.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {

    private final ContactRepository contactRepository;
    private final ContactMapper contactMapper;

    public ContactServiceImpl(
            ContactRepository contactRepository,
            ContactMapper contactMapper) {

        this.contactRepository = contactRepository;
        this.contactMapper = contactMapper;
    }

    @Override
    public ContactResponseDTO createContact(ContactRequestDTO request) {

        Contact contact = contactMapper.toEntity(request);

        Contact savedContact = contactRepository.save(contact);

        return contactMapper.toResponseDTO(savedContact);
    }

    @Override
    public List<ContactResponseDTO> getAllContacts() {

        return contactRepository.findAll()
                .stream()
                .map(contactMapper::toResponseDTO)
                .toList();
    }

    @Override
    public ContactResponseDTO getContactById(Long id) {

        Contact contact = contactRepository.findById(id)
                .orElseThrow(() ->
                        new ContactNotFoundException(
                                "Contact not found with id: " + id
                        )
                );

        return contactMapper.toResponseDTO(contact);
    }

    @Override
    public ContactResponseDTO updateContact(
            Long id,
            ContactRequestDTO request) {

        Contact contact = contactRepository.findById(id)
                .orElseThrow(() ->
                        new ContactNotFoundException(
                                "Contact not found with id: " + id
                        )
                );

        contactMapper.updateEntity(contact, request);

        Contact updatedContact = contactRepository.save(contact);

        return contactMapper.toResponseDTO(updatedContact);
    }

    @Override
    public void deleteContact(Long id) {

        if (!contactRepository.existsById(id)) {
            throw new ContactNotFoundException(
                    "Contact not found with id: " + id
            );
        }

        contactRepository.deleteById(id);
    }
}