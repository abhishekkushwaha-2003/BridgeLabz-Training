package com.bookbazaar;

//PrintedBook class extending Book
//Represents physical books
public class PrintedBook extends Book {

 // Constructor for PrintedBook
 public PrintedBook(String title, String author, double price, int stock) {
     super(title, author, price, stock);
 }

 // Discount logic for PrintedBook
 // 5% discount if quantity >= 3
 @Override
 public double applyDiscount(double price, int quantity) {
     if (quantity >= 3) {
         return price * quantity * 0.05;
     }
     return 0;
 }
}
