package com.vehiclerentalapplication;

//car class
class Car extends Vehicle implements Rentable {

	Car(int id, double rate) {
		super(id, "Car", rate);
	}

	// rent calculation for car (extra charge)
	public double calculateRent(int days) {
		return (baseRate * days) + 500;
	}
}
