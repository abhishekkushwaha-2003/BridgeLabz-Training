package com.bookbazaar;

//EBook class extending Book
//Represents digital books
public class EBook extends Book {

 // Constructor for EBook
 public EBook(String title, String author, double price, int stock) {
     super(title, author, price, stock);
 }

 // Discount logic for EBook
 // Flat 10% discount
 @Override
 public double applyDiscount(double price, int quantity) {
     return price * quantity * 0.10;
 }
}
