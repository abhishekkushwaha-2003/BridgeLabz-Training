package com.inheritance.hybridinheritance;

//Superclass Vehicle
public class Vehicle {

	// common attributes
	String model;
	int maxSpeed;

	// constructor
	Vehicle(String model, int maxSpeed) {
		this.model = model;
		this.maxSpeed = maxSpeed;
	}

	// method to display vehicle details
	void displayInfo() {
		System.out.println("Model: " + model);
		System.out.println("Max Speed: " + maxSpeed + " km/h");
	}
}

