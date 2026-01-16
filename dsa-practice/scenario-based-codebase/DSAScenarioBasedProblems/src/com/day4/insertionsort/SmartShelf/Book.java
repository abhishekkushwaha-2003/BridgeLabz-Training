package com.day4.insertionsort.SmartShelf;

//Represents a book in the digital library
public class Book {

 String title;
 String author;

 public Book(String title, String author) {
     this.title = title;
     this.author = author;
 }

 public void display() {
     System.out.println(title + " by " + author);
 }
}

