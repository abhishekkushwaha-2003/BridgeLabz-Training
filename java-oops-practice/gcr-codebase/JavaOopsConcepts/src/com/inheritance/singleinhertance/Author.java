package com.inheritance.singleinhertance;

//Subclass Author (extends Book)
class Author extends Book {

	// additional attributes
	String name;
	String bio;

	// constructor
	Author(String title, int publicationYear, String name, String bio) {
		super(title, publicationYear);
		this.name = name;
		this.bio = bio;
	}

	// overriding displayInfo()
	void displayInfo() {
		super.displayInfo();
		System.out.println("Author Name: " + name);
		System.out.println("Author Bio: " + bio);
	}
}

