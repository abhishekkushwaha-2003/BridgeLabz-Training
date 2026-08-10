package com.contact.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.contact.dto.ContactRequestDTO;
import com.contact.dto.ContactResponseDTO;
import com.contact.service.ContactService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/contacts")
@Tag(
    name = "Contacts",
    description = "APIs for managing contacts"
)
public class ContactController {

    private final ContactService contactService;

    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    // Create Contact
    @Operation(
        summary = "Create a new contact",
        description = "Creates and saves a new contact"
    )
    @ApiResponses({
        @ApiResponse(
            responseCode = "201",
            description = "Contact created successfully"
        ),
        @ApiResponse(
            responseCode = "400",
            description = "Invalid contact data"
        )
    })
    @PostMapping
    public ResponseEntity<ContactResponseDTO> createContact(
            @RequestBody @Valid ContactRequestDTO request) {

        ContactResponseDTO response =
                contactService.createContact(request);

        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    // Get All Contacts
    @Operation(
        summary = "Get all contacts",
        description = "Returns a list of all contacts"
    )
    @ApiResponse(
        responseCode = "200",
        description = "Contacts retrieved successfully"
    )
    @GetMapping
    public ResponseEntity<List<ContactResponseDTO>> getAllContacts() {

        List<ContactResponseDTO> response =
                contactService.getAllContacts();

        return ResponseEntity.ok(response);
    }

    // Get Contact By ID
    @Operation(
        summary = "Get contact by ID",
        description = "Returns a single contact using its ID"
    )
    @ApiResponses({
        @ApiResponse(
            responseCode = "200",
            description = "Contact found"
        ),
        @ApiResponse(
            responseCode = "404",
            description = "Contact not found"
        )
    })
    @GetMapping("/{id}")
    public ResponseEntity<ContactResponseDTO> getContactById(
            @PathVariable Long id) {

        ContactResponseDTO response =
                contactService.getContactById(id);

        return ResponseEntity.ok(response);
    }

    // Update Contact
    @Operation(
        summary = "Update contact",
        description = "Updates an existing contact using its ID"
    )
    @ApiResponses({
        @ApiResponse(
            responseCode = "200",
            description = "Contact updated successfully"
        ),
        @ApiResponse(
            responseCode = "400",
            description = "Invalid contact data"
        ),
        @ApiResponse(
            responseCode = "404",
            description = "Contact not found"
        )
    })
    @PutMapping("/{id}")
    public ResponseEntity<ContactResponseDTO> updateContact(
            @PathVariable Long id,
            @RequestBody @Valid ContactRequestDTO request) {

        ContactResponseDTO response =
                contactService.updateContact(id, request);

        return ResponseEntity.ok(response);
    }

    // Delete Contact
    @Operation(
        summary = "Delete contact",
        description = "Deletes a contact using its ID"
    )
    @ApiResponses({
        @ApiResponse(
            responseCode = "204",
            description = "Contact deleted successfully"
        ),
        @ApiResponse(
            responseCode = "404",
            description = "Contact not found"
        )
    })
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteContact(
            @PathVariable Long id) {

        contactService.deleteContact(id);

        return ResponseEntity.noContent().build();
    }
}