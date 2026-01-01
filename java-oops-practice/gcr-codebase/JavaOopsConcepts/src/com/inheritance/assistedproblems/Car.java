package com.inheritance.assistedproblems;

//Subclass Car
class Car extends Vehicle {

	// unique attribute
	int seatCapacity;

	Car(int maxSpeed, String fuelType, int seatCapacity) {
		super(maxSpeed, fuelType);
		this.seatCapacity = seatCapacity;
	}

	// overriding displayInfo()
	void displayInfo() {
		super.displayInfo();
		System.out.println("Seat Capacity: " + seatCapacity);
	}
}

