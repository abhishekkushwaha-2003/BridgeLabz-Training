package com.inheritance.hybridinheritance;

//Superclass
public class Person {

	// common attributes
	String name;
	int id;

	// constructor
	Person(String name, int id) {
		this.name = name;
		this.id = id;
	}

	// common method
	void displayPerson() {
		System.out.println("Name: " + name);
		System.out.println("ID: " + id);
	}
}

