package com.inheritance.assistedproblems;

//Subclass Dog
class Dog extends Animal {

	Dog(String name, int age) {
		super(name, age);
	}

	// overriding makeSound()
	void makeSound() {
		System.out.println(name + " says: Bark");
	}
}

