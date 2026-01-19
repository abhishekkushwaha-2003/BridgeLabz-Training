package com.AddressBookSystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// Manages all contacts
public class AddressBook {

    private ArrayList<Contact> contacts = new ArrayList<>();

    // Add new contact (duplicate check)
    public void addContact(Contact contact) {

        for (Contact c : contacts) {
            if (c.getFullName().equalsIgnoreCase(contact.getFullName())) {
                System.out.println("Duplicate contact not allowed.");
                return;
            }
        }

        contacts.add(contact);
        System.out.println("Contact added successfully.");
    }

    // Edit contact by name
    public void editContact(String name, String phone, String email) {

        for (Contact c : contacts) {
            if (c.getFullName().equalsIgnoreCase(name)) {
                c.updateContact(phone, email);
                System.out.println("Contact updated.");
                return;
            }
        }

        System.out.println("Contact not found.");
    }

    // Delete contact by name
    public void deleteContact(String name) {

        contacts.removeIf(c ->
            c.getFullName().equalsIgnoreCase(name)
        );

        System.out.println("Contact deleted if it existed.");
    }

    // Search by city or state
    public void searchByCityOrState(String value) {

        for (Contact c : contacts) {
            if (c.getAddress().getCity().equalsIgnoreCase(value) ||
                c.getAddress().getState().equalsIgnoreCase(value)) {
                c.display();
            }
        }
    }

    // Display all contacts sorted alphabetically
    public void displayAll() {

        Collections.sort(contacts, Comparator.comparing(Contact::getFullName));

        System.out.println("---- Address Book ----");
        for (Contact c : contacts) {
            c.display();
        }
    }
}
