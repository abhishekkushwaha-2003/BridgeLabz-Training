package com.inheritance.assistedproblems;

//Superclass
class Vehicle {

	// common attributes
	int maxSpeed;
	String fuelType;

	// constructor
	Vehicle(int maxSpeed, String fuelType) {
		this.maxSpeed = maxSpeed;
		this.fuelType = fuelType;
	}

	// method to display vehicle information
	void displayInfo() {
		System.out.println("Max Speed: " + maxSpeed + " km/h");
		System.out.println("Fuel Type: " + fuelType);
	}
}

