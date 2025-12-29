package com.constructorandaccessmodifier.level1;

public class Person {
	String name;
	String address;
	int age;
	
	
	// parameterized constructor
	Person(String name, String address, int age){
		this.name = name;
		this.address = address;
		this.age = age;
		
	}
	
	// copy constructor
	Person(Person details){
		this.name = details.name;
		this.address = details.address;
		this.age = details.age;
	}
	
	// method to display Person's details
	void displayPersonDetail() {
		System.out.println("Person Name : "+name);
		System.out.println("Person Address : "+address);
		System.out.println("Person Age : "+age);
		
	}
	
	// main method
	public static void main(String [] args) {
		
		// create a object of parameterized constructor
		Person person1 = new Person("Abhishek","Bhopal",22);
		
		// create a object of copy constructor
		Person person2 = new Person(person1);
		
		// display method calling
		person2.displayPersonDetail();
		
	}

}
