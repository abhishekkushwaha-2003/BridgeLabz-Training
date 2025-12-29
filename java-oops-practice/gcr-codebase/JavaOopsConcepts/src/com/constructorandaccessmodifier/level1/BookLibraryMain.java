package com.constructorandaccessmodifier.level1;

// Main class
// this class contains the main method
public class BookLibraryMain {


	    public static void main(String[] args) {

	        // creating Book object
	    	BookLibrary b1 = new BookLibrary("978-0135166307", "Java Basics", "James Gosling");

	        System.out.println("Book Details:");
	        b1.displayBook();

	        // modifying private variable using setter method
	        b1.setAuthor("Herbert Schildt");

	        System.out.println("\nBook Details After Author Update:");
	        b1.displayBook();

	        // creating EBook object
	        EBook eb1 = new EBook(
	                "978-1492056270",
	                "Advanced Java",
	                "Kathy Sierra",
	                "5 MB"
	        );

	        System.out.println("\nEBook Details:");
	        eb1.displayEBookDetails();
	    }
	}
