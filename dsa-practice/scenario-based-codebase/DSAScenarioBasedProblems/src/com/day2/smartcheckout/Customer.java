package com.day2.smartcheckout;

import java.util.List;

//Customer class representing a shopper
public class Customer {

 // Customer name
 String name;

 // List of items customer wants to buy
 List<String> items;

 // Constructor
 public Customer(String name, List<String> items) {
     this.name = name;
     this.items = items;
 }
}
