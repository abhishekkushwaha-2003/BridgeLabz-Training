package com.inheritance.singleinhertance;

public class LibraryMain {
		public static void main(String[] args) {

			// creating Author object
			Book b = new Author(
				"Effective Java",
				2018,
				"Joshua Bloch",
				"Expert in Java programming"
			);

			// polymorphic method call
			b.displayInfo();
		}
	}


