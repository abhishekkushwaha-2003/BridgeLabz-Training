package com.AddressBookSystem;

//Represents address details of a contact
public class Address {

 private String city;
 private String state;
 private String zip;

 // Constructor
 public Address(String city, String state, String zip) {
     this.city = city;
     this.state = state;
     this.zip = zip;
 }

 // Getters
 public String getCity() {
     return city;
 }

 public String getState() {
     return state;
 }

 // Display address
 public String display() {
     return city + ", " + state + " - " + zip;
 }
}
