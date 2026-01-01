package com.inheritance.assistedproblems;

//Subclass Truck
class Truck extends Vehicle {

	// unique attribute
	int loadCapacity; // in tons

	Truck(int maxSpeed, String fuelType, int loadCapacity) {
		super(maxSpeed, fuelType);
		this.loadCapacity = loadCapacity;
	}

	// overriding displayInfo()
	void displayInfo() {
		super.displayInfo();
		System.out.println("Load Capacity: " + loadCapacity + " tons");
	}
}

