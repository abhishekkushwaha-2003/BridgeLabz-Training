package com.inheritance.assistedproblems;

//Subclass Motorcycle
class Motorcycle extends Vehicle {

	// unique attribute
	boolean hasCarrier;

	Motorcycle(int maxSpeed, String fuelType, boolean hasCarrier) {
		super(maxSpeed, fuelType);
		this.hasCarrier = hasCarrier;
	}

	// overriding displayInfo()
	void displayInfo() {
		super.displayInfo();
		System.out.println("Carrier Available: " + hasCarrier);
	}
}

