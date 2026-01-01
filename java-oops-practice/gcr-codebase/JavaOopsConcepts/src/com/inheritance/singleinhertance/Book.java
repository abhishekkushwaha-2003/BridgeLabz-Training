package com.inheritance.singleinhertance;

//Superclass
class Book {

	// common attributes
	String title;
	int publicationYear;

	// constructor
	Book(String title, int publicationYear) {
		this.title = title;
		this.publicationYear = publicationYear;
	}

	// method to display book information
	void displayInfo() {
		System.out.println("Book Title: " + title);
		System.out.println("Publication Year: " + publicationYear);
	}
}

