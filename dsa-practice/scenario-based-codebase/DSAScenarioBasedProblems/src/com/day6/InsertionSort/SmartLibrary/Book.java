package com.day6.InsertionSort.SmartLibrary;

//Represents a book borrowed from the library
public class Book {

 String title;    // Book title
 String author;   // Book author

 // Constructor
 public Book(String title, String author) {
     this.title = title;
     this.author = author;
 }

 // Display book details
 public void display() {
     System.out.println(title + " by " + author);
 }
}
