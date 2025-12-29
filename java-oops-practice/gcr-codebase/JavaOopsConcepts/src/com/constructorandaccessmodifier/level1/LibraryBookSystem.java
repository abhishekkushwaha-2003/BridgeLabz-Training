package com.constructorandaccessmodifier.level1;

public class LibraryBookSystem {

	// LibraryBookSystem class
	// this class stores details of a library book

	    String title;
	    String author;
	    double price;
	    boolean available;

	    // constructor to initialize book details
	    LibraryBookSystem(String title, String author, double price) {
	        this.title = title;
	        this.author = author;
	        this.price = price;
	        available = true;   // book is available when added to library
	    }

	    // method to borrow a book
	    void borrowBook() {

	        // check if book is available or not
	        if (available) {
	            available = false;
	            System.out.println("Book borrowed successfully.");
	        } else {
	            System.out.println("Sorry, this book is already issued.");
	        }
	    }

	    // method to display book details
	    void displayBookDetails() {
	        System.out.println("Title       : " + title);
	        System.out.println("Author      : " + author);
	        System.out.println("Price       : Rs. " + price);
	        System.out.println("Available   : " + available);
	    }
	}
