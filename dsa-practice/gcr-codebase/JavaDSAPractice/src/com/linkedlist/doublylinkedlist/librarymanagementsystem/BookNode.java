package com.linkedlist.doublylinkedlist.librarymanagementsystem;

//Node class for Doubly Linked List
class BookNode {

 String title;
 String author;
 String genre;
 int bookId;
 boolean isAvailable;

 BookNode next;
 BookNode prev;

 // Constructor
 BookNode(String title, String author, String genre, int bookId, boolean isAvailable) {
     this.title = title;
     this.author = author;
     this.genre = genre;
     this.bookId = bookId;
     this.isAvailable = isAvailable;
     this.next = null;
     this.prev = null;
 }
}
