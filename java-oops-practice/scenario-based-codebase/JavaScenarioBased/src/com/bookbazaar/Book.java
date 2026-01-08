package com.bookbazaar;

//Base class representing a generic book
public class Book implements IDiscountable {

 // Book title
 protected String title;

 // Author name
 protected String author;

 // Price of a single book
 protected double price;

 // Available stock (private for encapsulation)
 private int stock;

 // Constructor without any offer
 public Book(String title, String author, double price, int stock) {
     this.title = title;
     this.author = author;
     this.price = price;
     this.stock = stock;
 }

 // Method to reduce stock safely
 public void reduceStock(int quantity) {
     if (quantity <= stock) {
         stock -= quantity;
     } else {
         System.out.println("Not enough stock available");
     }
 }

 // Getter for stock
 public int getStock() {
     return stock;
 }

 // Default discount (no discount)
 @Override
 public double applyDiscount(double price, int quantity) {
     return 0;
 }
}
