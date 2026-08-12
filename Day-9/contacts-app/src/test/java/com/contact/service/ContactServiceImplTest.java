package com.contact.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.contact.dto.ContactRequestDTO;
import com.contact.dto.ContactResponseDTO;
import com.contact.entity.Contact;
import com.contact.exception.ContactNotFoundException;
import com.contact.mapper.ContactMapper;
import com.contact.repository.ContactRepository;

class ContactServiceImplTest {

    private ContactRepository contactRepository;
    private ContactMapper contactMapper;

    private ContactServiceImpl contactService;

    @BeforeEach
    void setUp() {

        contactRepository = mock(ContactRepository.class);
        contactMapper = mock(ContactMapper.class);

        contactService = new ContactServiceImpl(
                contactRepository,
                contactMapper
        );
    }

    @Test
    void testCreateContact() {

        ContactRequestDTO request = new ContactRequestDTO();

        request.setFirstName("Abhishek");
        request.setLastName("Kushwaha");
        request.setEmail("abhishek@gmail.com");
        request.setPhone("9876543210");
        request.setAltPhone("9123456789");

        Contact contact = new Contact();

        contact.setId(1L);
        contact.setFirstName("Abhishek");
        contact.setLastName("Kushwaha");
        contact.setEmail("abhishek@gmail.com");
        contact.setPhone("9876543210");
        contact.setAltPhone("9123456789");

        ContactResponseDTO response = new ContactResponseDTO();

        response.setId(1L);
        response.setFirstName("Abhishek");
        response.setLastName("Kushwaha");
        response.setEmail("abhishek@gmail.com");
        response.setPhone("9876543210");
        response.setAltPhone("9123456789");

        when(contactMapper.toEntity(request))
                .thenReturn(contact);

        when(contactRepository.save(contact))
                .thenReturn(contact);

        when(contactMapper.toResponseDTO(contact))
                .thenReturn(response);

        ContactResponseDTO result =
                contactService.createContact(request);

        assertEquals(1L, result.getId());
        assertEquals("Abhishek", result.getFirstName());
        assertEquals("Kushwaha", result.getLastName());
        assertEquals("abhishek@gmail.com", result.getEmail());

        verify(contactMapper).toEntity(request);
        verify(contactRepository).save(contact);
        verify(contactMapper).toResponseDTO(contact);
    }
    
    @Test
    void testGetContactById() {

        Long id = 1L;

        Contact contact = new Contact();

        contact.setId(1L);
        contact.setFirstName("Abhishek");
        contact.setLastName("Kushwaha");
        contact.setEmail("abhishek@gmail.com");
        contact.setPhone("9876543210");
        contact.setAltPhone("9123456789");

        ContactResponseDTO response = new ContactResponseDTO();

        response.setId(1L);
        response.setFirstName("Abhishek");
        response.setLastName("Kushwaha");
        response.setEmail("abhishek@gmail.com");
        response.setPhone("9876543210");
        response.setAltPhone("9123456789");

        when(contactRepository.findById(id))
                .thenReturn(Optional.of(contact));

        when(contactMapper.toResponseDTO(contact))
                .thenReturn(response);

        ContactResponseDTO result =
                contactService.getContactById(id);

        assertEquals(1L, result.getId());
        assertEquals("Abhishek", result.getFirstName());
        assertEquals("Kushwaha", result.getLastName());
        assertEquals("abhishek@gmail.com", result.getEmail());

        verify(contactRepository).findById(id);
        verify(contactMapper).toResponseDTO(contact);
    }
    
    @Test
    void testGetContactByIdNotFound() {

        Long id = 999L;

        when(contactRepository.findById(id))
                .thenReturn(Optional.empty());

        assertThrows(
                ContactNotFoundException.class,
                () -> contactService.getContactById(id)
        );

        verify(contactRepository).findById(id);
    }
    
    @Test
    void testGetAllContacts() {

        Contact contact1 = new Contact();

        contact1.setId(1L);
        contact1.setFirstName("Abhishek");
        contact1.setLastName("Kushwaha");
        contact1.setEmail("abhishek@gmail.com");
        contact1.setPhone("9876543210");
        contact1.setAltPhone("9123456789");


        Contact contact2 = new Contact();

        contact2.setId(2L);
        contact2.setFirstName("Rahul");
        contact2.setLastName("Sharma");
        contact2.setEmail("rahul@gmail.com");
        contact2.setPhone("9123456789");
        contact2.setAltPhone("9876543210");


        ContactResponseDTO response1 = new ContactResponseDTO();

        response1.setId(1L);
        response1.setFirstName("Abhishek");
        response1.setLastName("Kushwaha");
        response1.setEmail("abhishek@gmail.com");
        response1.setPhone("9876543210");
        response1.setAltPhone("9123456789");


        ContactResponseDTO response2 = new ContactResponseDTO();

        response2.setId(2L);
        response2.setFirstName("Rahul");
        response2.setLastName("Sharma");
        response2.setEmail("rahul@gmail.com");
        response2.setPhone("9123456789");
        response2.setAltPhone("9876543210");


        List<Contact> contacts = List.of(contact1, contact2);


        when(contactRepository.findAll())
                .thenReturn(contacts);

        when(contactMapper.toResponseDTO(contact1))
                .thenReturn(response1);

        when(contactMapper.toResponseDTO(contact2))
                .thenReturn(response2);


        List<ContactResponseDTO> result =
                contactService.getAllContacts();


        assertEquals(2, result.size());

        assertEquals("Abhishek", result.get(0).getFirstName());
        assertEquals("Rahul", result.get(1).getFirstName());


        verify(contactRepository).findAll();

        verify(contactMapper).toResponseDTO(contact1);
        verify(contactMapper).toResponseDTO(contact2);
    }
    
    @Test
    void testUpdateContact() {

        Long id = 1L;

        // Request DTO
        ContactRequestDTO request = new ContactRequestDTO();

        request.setFirstName("Abhishek Updated");
        request.setLastName("Kushwaha");
        request.setEmail("updated@gmail.com");
        request.setPhone("9999999999");
        request.setAltPhone("8888888888");

        // Existing Entity
        Contact contact = new Contact();

        contact.setId(1L);
        contact.setFirstName("Abhishek");
        contact.setLastName("Kushwaha");
        contact.setEmail("abhishek@gmail.com");
        contact.setPhone("9876543210");
        contact.setAltPhone("9123456789");

        // Updated Entity
        Contact updatedContact = new Contact();

        updatedContact.setId(1L);
        updatedContact.setFirstName("Abhishek Updated");
        updatedContact.setLastName("Kushwaha");
        updatedContact.setEmail("updated@gmail.com");
        updatedContact.setPhone("9999999999");
        updatedContact.setAltPhone("8888888888");

        // Response DTO
        ContactResponseDTO response = new ContactResponseDTO();

        response.setId(1L);
        response.setFirstName("Abhishek Updated");
        response.setLastName("Kushwaha");
        response.setEmail("updated@gmail.com");
        response.setPhone("9999999999");
        response.setAltPhone("8888888888");

        // Mock repository
        when(contactRepository.findById(id))
                .thenReturn(Optional.of(contact));

        // Mock mapper update
        doAnswer(invocation -> {

            Contact entity = invocation.getArgument(0);

            entity.setFirstName(request.getFirstName());
            entity.setLastName(request.getLastName());
            entity.setEmail(request.getEmail());
            entity.setPhone(request.getPhone());
            entity.setAltPhone(request.getAltPhone());

            return null;

        }).when(contactMapper).updateEntity(contact, request);

        // Mock save
        when(contactRepository.save(contact))
                .thenReturn(updatedContact);

        // Mock response conversion
        when(contactMapper.toResponseDTO(updatedContact))
                .thenReturn(response);

        // Actual method call
        ContactResponseDTO result =
                contactService.updateContact(id, request);

        // Assertions
        assertEquals(1L, result.getId());
        assertEquals("Abhishek Updated", result.getFirstName());
        assertEquals("updated@gmail.com", result.getEmail());
        assertEquals("9999999999", result.getPhone());

        // Verify calls
        verify(contactRepository).findById(id);
        verify(contactMapper).updateEntity(contact, request);
        verify(contactRepository).save(contact);
        verify(contactMapper).toResponseDTO(updatedContact);
    }
    
    @Test
    void testUpdateContactNotFound() {

        Long id = 999L;

        ContactRequestDTO request = new ContactRequestDTO();

        request.setFirstName("Abhishek");
        request.setLastName("Kushwaha");
        request.setEmail("abhishek@gmail.com");
        request.setPhone("9876543210");
        request.setAltPhone("9123456789");

        when(contactRepository.findById(id))
                .thenReturn(Optional.empty());

        assertThrows(
                ContactNotFoundException.class,
                () -> contactService.updateContact(id, request)
        );

        verify(contactRepository).findById(id);

        verify(contactRepository, never()).save(any(Contact.class));

        verify(contactMapper, never()).updateEntity(
                any(Contact.class),
                any(ContactRequestDTO.class)
        );
    }
    
    @Test
    void testDeleteContact() {

        Long id = 1L;

        when(contactRepository.existsById(id))
                .thenReturn(true);

        contactService.deleteContact(id);

        verify(contactRepository).existsById(id);
        verify(contactRepository).deleteById(id);
    }
    
    @Test
    void testDeleteContactNotFound() {

        Long id = 999L;

        when(contactRepository.existsById(id))
                .thenReturn(false);

        assertThrows(
                ContactNotFoundException.class,
                () -> contactService.deleteContact(id)
        );

        verify(contactRepository).existsById(id);

        verify(contactRepository, never())
                .deleteById(id);
    }
}