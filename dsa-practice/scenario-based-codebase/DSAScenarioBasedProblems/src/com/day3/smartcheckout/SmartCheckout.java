package com.day3.smartcheckout;

import java.util.*;

//SmartCheckout system managing billing queue and inventory
public class SmartCheckout {

 // Queue for customers at checkout
 private Queue<Customer> checkoutQueue = new LinkedList<>();

 // Item for Price mapping
 private Map<String, Integer> priceMap = new HashMap<>();

 // Item for Stock mapping
 private Map<String, Integer> stockMap = new HashMap<>();

 // Constructor initializes items, prices, and stock
 public SmartCheckout() {
     priceMap.put("Milk", 50);
     priceMap.put("Bread", 30);
     priceMap.put("Eggs", 60);
     priceMap.put("Rice", 80);

     stockMap.put("Milk", 10);
     stockMap.put("Bread", 15);
     stockMap.put("Eggs", 12);
     stockMap.put("Rice", 20);
 }

 // Add customer to checkout queue
 public void addCustomer(Customer customer) {
     checkoutQueue.offer(customer);
     System.out.println("Customer added: " + customer.name);
 }

 // Process next customer in queue
 public void processCustomer() {

     if (checkoutQueue.isEmpty()) {
         System.out.println("No customers in queue");
         return;
     }

     Customer customer = checkoutQueue.poll();
     int totalBill = 0;

     System.out.println("\nBilling customer: " + customer.name);

     for (String item : customer.items) {

         // Check stock availability
         if (stockMap.containsKey(item) && stockMap.get(item) > 0) {

             int price = priceMap.get(item);
             totalBill += price;

             // Update stock after purchase
             stockMap.put(item, stockMap.get(item) - 1);

             System.out.println(item + " added | Price: " + price);
         } else {
             System.out.println(item + " out of stock");
         }
     }

     System.out.println("Total Bill: ₹" + totalBill);
 }

 // Display remaining stock
 public void displayStock() {
     System.out.println("\nCurrent Stock: " + stockMap);
 }
}
