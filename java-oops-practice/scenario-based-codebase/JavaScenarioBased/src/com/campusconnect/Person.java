package com.campusconnect;

//base class for common person details
abstract class Person {

	protected int id;
	protected String name;
	protected String email;

	// constructor
	Person(int id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}

	// polymorphic method
	abstract void printDetails();
}

