package com.medistore;

import java.time.LocalDate;

//Base class representing a generic medicine
public abstract class Medicine implements ISellable {

 // Medicine name
 protected String name;

 // Price per unit (sensitive data)
 protected double price;

 // Expiry date of medicine
 protected LocalDate expiryDate;

 // Available quantity (kept private)
 private int quantity;

 // Constructor with default quantity = 10
 public Medicine(String name, double price, LocalDate expiryDate) {
     this(name, price, expiryDate, 10);
 }

 // Constructor with custom quantity
 public Medicine(String name, double price, LocalDate expiryDate, int quantity) {
     this.name = name;
     this.price = price;
     this.expiryDate = expiryDate;
     this.quantity = quantity;
 }

 // Method to sell medicine units
 @Override
 public void sell(int units) {

     // Check expiry before selling
     if (checkExpiry()) {
         System.out.println("Cannot sell expired medicine: " + name);
         return;
     }

     // Check stock availability
     if (units <= quantity) {

         // Reduce stock
         quantity -= units;

         // Calculate total cost
         double totalCost = calculateTotalCost(units);

         System.out.println(units + " units of " + name + " sold. Total ₹" + totalCost);
     } else {
         System.out.println("Insufficient stock for " + name);
     }
 }

 // Private method to calculate total price
 // Sensitive pricing logic hidden
 private double calculateTotalCost(int units) {

     // Base price calculation
     double total = price * units;

     // Apply discount if bulk purchase
     if (units >= 5) {
         total = total - (total * 0.10); // 10% discount
     }

     return total;
 }

 // Getter for available quantity
 public int getQuantity() {
     return quantity;
 }
}
