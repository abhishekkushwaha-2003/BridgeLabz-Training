package com.linkedlist.doublylinkedlist.moviemanagementsystem;

//Doubly Linked List Node for Movie
class MovieNode {

 String title;
 String director;
 int year;
 double rating;

 MovieNode next;
 MovieNode prev;

 // constructor
 MovieNode(String title, String director, int year, double rating) {
     this.title = title;
     this.director = director;
     this.year = year;
     this.rating = rating;
     this.next = null;
     this.prev = null;
 }
}
