package com.inheritance.hybridinheritance;

//PetrolVehicle class (Hybrid Inheritance)
class PetrolVehicle extends Vehicle implements Refuelable {

	// unique attribute
	int fuelTankCapacity;

	PetrolVehicle(String model, int maxSpeed, int fuelTankCapacity) {
		super(model, maxSpeed);
		this.fuelTankCapacity = fuelTankCapacity;
	}

	// implementation of refuel() method
	public void refuel() {
		System.out.println("Petrol vehicle is being refueled.");
	}
}

