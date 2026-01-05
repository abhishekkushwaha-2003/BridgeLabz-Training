package com.vehiclerentalapplication;

//parent vehicle class
class Vehicle {

	// protected so child classes can use
	protected int vehicleId;
	protected String vehicleType;
	protected double baseRate;

	// constructor
	Vehicle(int vehicleId, String vehicleType, double baseRate) {
		this.vehicleId = vehicleId;
		this.vehicleType = vehicleType;
		this.baseRate = baseRate;
	}

	// getters
	int getVehicleId() {
		return vehicleId;
	}

	String getVehicleType() {
		return vehicleType;
	}

	double getBaseRate() {
		return baseRate;
	}

	// method for displaying details
	void displayVehicle() {
		System.out.println("Vehicle ID: " + vehicleId);
		System.out.println("Vehicle Type: " + vehicleType);
		System.out.println("Base Rate: " + baseRate);
	}
}

