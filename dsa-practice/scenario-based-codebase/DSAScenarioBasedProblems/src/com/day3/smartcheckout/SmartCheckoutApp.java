package com.day2.smartcheckout;

import java.util.Arrays;

//Main class
public class SmartCheckoutApp {

 public static void main(String[] args) {

     // Create SmartCheckout system
     SmartCheckout checkout = new SmartCheckout();

     // Create customers with item lists
     Customer c1 = new Customer("Abhishek", Arrays.asList("Milk", "Bread", "Eggs"));

     Customer c2 = new Customer("Rajeev", Arrays.asList("Rice", "Milk", "Milk"));

     // Add customers to billing queue
     checkout.addCustomer(c1);
     checkout.addCustomer(c2);

     // Process customers one by one
     checkout.processCustomer();
     checkout.processCustomer();

     // Display remaining stock after billing
     checkout.displayStock();
 }
}
