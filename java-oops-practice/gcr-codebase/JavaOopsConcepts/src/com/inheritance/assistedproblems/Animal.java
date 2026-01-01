package com.inheritance.assistedproblems;

//Superclass
class Animal {

	// attributes
	String name;
	int age;

	// constructor
	Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// method to be overridden
	void makeSound() {
		System.out.println("Animal makes a sound");
	}
}
