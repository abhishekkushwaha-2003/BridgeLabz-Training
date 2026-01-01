package com.inheritance.assistedproblems;

//Subclass Bird
class Bird extends Animal {

	Bird(String name, int age) {
		super(name, age);
	}

	// overriding makeSound()
	void makeSound() {
		System.out.println(name + " says: Cuckoo");
	}
}

