package com.cabbygoapp;

//abstract vehicle class
abstract class Vehicle implements IRideService {

	protected String vehicleNumber;
	protected int capacity;
	protected String type;

	private double fare; // hidden from outside

	// constructor
	Vehicle(String vehicleNumber, int capacity, String type) {
		this.vehicleNumber = vehicleNumber;
		this.capacity = capacity;
		this.type = type;
	}

	// protected setter
	protected void setFare(double fare) {
		this.fare = fare;
	}

	// public getter
	public double getFare() {
		return fare;
	}

	// common method
	public void showVehicleDetails() {
		System.out.println("Vehicle Type: " + type);
		System.out.println("Vehicle Number: " + vehicleNumber);
		System.out.println("Capacity: " + capacity);
	}
}


