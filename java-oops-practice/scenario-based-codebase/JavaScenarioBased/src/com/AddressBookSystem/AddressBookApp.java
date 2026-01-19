package com.AddressBookSystem;

//Main class – program starts here
public class AddressBookApp {

 public static void main(String[] args) {

     AddressBook book = new AddressBook();

     // Create contacts
     Contact c1 = new Contact("Abhishek", "Sharma", "9876543210", "abhishek@gmail.com", new Address("Bhopal", "Madhya Pradesh", "462001"));

     Contact c2 = new Contact("Rajeev", "Verma", "9123456780", "rajeev@gmail.com", new Address("Indore", "Madhya Pradesh", "452002"));

     // Add contacts
     book.addContact(c1);
     book.addContact(c2);

     System.out.println();

     // Display all contacts
     book.displayAll();

     System.out.println();

     // Edit contact
     book.editContact("Abhishek Sharma", "9999999999", "abhishek_new@gmail.com");

     System.out.println();

     // Search by city
     System.out.println("Search by City: Bhopal");
     book.searchByCityOrState("Bhopal");

     System.out.println();

     // Delete contact
     book.deleteContact("Rajeev Verma");

     System.out.println();

     // Final list
     book.displayAll();
 }
}
