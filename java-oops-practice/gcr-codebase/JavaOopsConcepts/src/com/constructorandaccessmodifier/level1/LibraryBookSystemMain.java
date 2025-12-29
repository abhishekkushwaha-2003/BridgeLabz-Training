package com.constructorandaccessmodifier.level1;

public class LibraryBookSystemMain {

	// LibraryBookSystemMain class
	// this class contains the main method

	    public static void main(String[] args) {

	        // creating book object
	    	LibraryBookSystem book1 = new LibraryBookSystem("Java Programming", "Herbert Schildt", 450);

	        System.out.println("Book Details:");
	        book1.displayBookDetails();

	        // borrowing the book
	        System.out.println("\nTrying to borrow the book...");
	        book1.borrowBook();

	        System.out.println("\nBook Details After Borrowing:");
	        book1.displayBookDetails();

	        // trying to borrow again
	        System.out.println("\nTrying to borrow the book again...");
	        book1.borrowBook();
	    }
	}
