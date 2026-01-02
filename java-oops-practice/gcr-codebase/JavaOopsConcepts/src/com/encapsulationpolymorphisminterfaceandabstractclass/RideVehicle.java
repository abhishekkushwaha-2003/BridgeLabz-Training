package com.encapsulationpolymorphisminterfaceandabstractclass;

//abstract class for ride vehicles
abstract class RideVehicle {

	// private fields (encapsulation)
	private int vehicleId;
	private String driverName;
	private double ratePerKm;

	// constructor
	RideVehicle(int vehicleId, String driverName, double ratePerKm) {
		this.vehicleId = vehicleId;
		this.driverName = driverName;
		this.ratePerKm = ratePerKm;
	}

	// getters
	int getVehicleId() {
		return vehicleId;
	}

	String getDriverName() {
		return driverName;
	}

	double getRatePerKm() {
		return ratePerKm;
	}

	// abstract method
	abstract double calculateFare(double distance);

	// common method
	void getVehicleDetails() {
		System.out.println("Vehicle ID: " + vehicleId);
		System.out.println("Driver Name: " + driverName);
		System.out.println("Rate Per Km: " + ratePerKm);
	}
}

