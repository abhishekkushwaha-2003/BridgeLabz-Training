package com.encapsulationpolymorphisminterfaceandabstractclass;

//ride auto class
class RideAuto extends RideVehicle implements GPS {

	private String location;

	RideAuto(int id, String driver, double rate) {
		super(id, driver, rate);
	}

	// auto fare calculation
	double calculateFare(double distance) {
		return distance * getRatePerKm();
	}

	public void getCurrentLocation() {
		System.out.println("Auto Location: " + location);
	}

	public void updateLocation(String location) {
		this.location = location;
	}
}
