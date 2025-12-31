package com.objectmodelingandobjectdiagram.assistedproblem;

public class Aggregation {
	    public static void main(String[] args) {

	        // creating Book objects (independent)
	        Book b1 = new Book("Java Basics", "James Gosling");
	        Book b2 = new Book("Python Guide", "Guido van Rossum");
	        Book b3 = new Book("C Programming", "Dennis Ritchie");

	        // creating Library objects
	        Library lib1 = new Library();
	        Library lib2 = new Library();

	        // adding books to libraries
	        lib1.addBook(b1);
	        lib1.addBook(b2);

	        lib2.addBook(b2); // same book in another library
	        lib2.addBook(b3);

	        // displaying books
	        System.out.println("Library 1 Books:");
	        lib1.showBooks();

	        System.out.println("\nLibrary 2 Books:");
	        lib2.showBooks();
	    }
	}

