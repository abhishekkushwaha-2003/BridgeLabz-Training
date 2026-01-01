package com.inheritance.assistedproblems;

//Subclass Cat
class Cat extends Animal {

	Cat(String name, int age) {
		super(name, age);
	}

	// overriding makeSound()
	void makeSound() {
		System.out.println(name + " says: Meow");
	}
}

