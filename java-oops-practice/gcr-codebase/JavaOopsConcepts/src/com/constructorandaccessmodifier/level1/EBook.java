package com.constructorandaccessmodifier.level1;

//EBook class
//this class extends Book to demonstrate protected access

class EBook extends BookLibrary {

 String fileSize;

 // constructor
 EBook(String ISBN, String title, String author, String fileSize) {
     super(ISBN, title, author);
     this.fileSize = fileSize;
 }

 // method to display EBook details
 void displayEBookDetails() {

     // accessing public and protected members from parent class
     System.out.println("ISBN      : " + ISBN);
     System.out.println("Title     : " + title);
     System.out.println("File Size : " + fileSize);
     System.out.println("Author    : " + getAuthor());
 }
}

