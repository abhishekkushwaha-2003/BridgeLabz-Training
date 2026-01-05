package com.vehiclerentalapplication;

//truck class
class Truck extends Vehicle implements Rentable {

	Truck(int id, double rate) {
		super(id, "Truck", rate);
	}

	// rent calculation for truck (heavy vehicle)
	public double calculateRent(int days) {
		return (baseRate * days) + 1000;
	}
}
