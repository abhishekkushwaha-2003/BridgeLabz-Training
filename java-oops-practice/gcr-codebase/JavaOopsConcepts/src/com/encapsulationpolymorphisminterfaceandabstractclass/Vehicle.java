package com.encapsulationpolymorphisminterfaceandabstractclass;

//abstract vehicle class
abstract class Vehicle {

	// private fields (for safety)
	private String vehicleNumber;
	private String type;
	private double rentalRate;

	// insurance policy number (kept private)
	private String insurancePolicyNumber;

	// constructor
	Vehicle(String vehicleNumber, String type, double rentalRate, String policyNo) {
		this.vehicleNumber = vehicleNumber;
		this.type = type;
		this.rentalRate = rentalRate;
		this.insurancePolicyNumber = policyNo;
	}

	// getters (no direct access)
	String getVehicleNumber() {
		return vehicleNumber;
	}

	String getType() {
		return type;
	}

	double getRentalRate() {
		return rentalRate;
	}

	// setter with basic check
	void setRentalRate(double rentalRate) {
		if (rentalRate > 0) {
			this.rentalRate = rentalRate;
		}
	}

	// insurance policy hidden from outside
	String getInsurancePolicyNumber() {
		return insurancePolicyNumber;
	}

	// abstract method
	abstract double calculateRentalCost(int days);
}
