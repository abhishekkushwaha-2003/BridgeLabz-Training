package com.inheritance.hierarchicalinheritance;

//Superclass
class Person {

	// common attributes
	String name;
	int age;

	// constructor
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// common method
	void displayDetails() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
}

