package com.vehiclerentalapplication;

//bike class
class Bike extends Vehicle implements Rentable {

	Bike(int id, double rate) {
		super(id, "Bike", rate);
	}

	// rent calculation for bike
	public double calculateRent(int days) {
		return baseRate * days;
	}
}

