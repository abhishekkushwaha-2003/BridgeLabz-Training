package com.bookbazaar;

//Order class representing a customer's order
public class Order {

 // Ordered book
 private Book book;

 // Quantity ordered
 private int quantity;

 // Order status (restricted access)
 private String status;

 // Constructor to create an order
 public Order(Book book, int quantity) {
     this.book = book;
     this.quantity = quantity;
     this.status = "CREATED";
 }

 // Method to calculate total cost
 // Formula: price × quantity – discount
 public double calculateTotalCost() {

     // Base cost calculation
     double baseCost = book.price * quantity;

     // Discount based on book type
     double discount = book.applyDiscount(book.price, quantity);

     // Reduce stock after order
     book.reduceStock(quantity);

     // Return final payable amount
     return baseCost - discount;
 }

 // Getter for order status
 public String getStatus() {
     return status;
 }

 // Protected method to update status
 // Cannot be changed directly from outside
 protected void updateStatus(String status) {
     this.status = status;
 }
}

