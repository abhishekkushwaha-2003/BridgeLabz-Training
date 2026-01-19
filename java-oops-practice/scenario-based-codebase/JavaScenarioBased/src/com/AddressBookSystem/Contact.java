package com.AddressBookSystem;

//Represents a contact in the address book
public class Contact {

 // Encapsulated fields
 private String firstName;
 private String lastName;
 private String phone;
 private String email;
 private Address address; // Composition

 // Constructor
 public Contact(String firstName, String lastName,
                String phone, String email, Address address) {

     this.firstName = firstName;
     this.lastName = lastName;
     this.phone = phone;
     this.email = email;
     this.address = address;
 }

 // Getters
 public String getFullName() {
     return firstName + " " + lastName;
 }

 public Address getAddress() {
     return address;
 }

 // Update contact details
 public void updateContact(String phone, String email) {
     this.phone = phone;
     this.email = email;
 }

 // Display contact
 public void display() {
     System.out.println(
         "Name: " + getFullName() +
         ", Phone: " + phone +
         ", Email: " + email +
         ", Address: " + address.display()
     );
 }
}
