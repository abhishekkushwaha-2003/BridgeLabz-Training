package com.encapsulationpolymorphisminterfaceandabstractclass;

//ride car class
class RideCar extends RideVehicle implements GPS {

	private String location;

	RideCar(int id, String driver, double rate) {
		super(id, driver, rate);
	}

	// car fare calculation
	double calculateFare(double distance) {
		return distance * getRatePerKm();
	}

	public void getCurrentLocation() {
		System.out.println("Car Location: " + location);
	}

	public void updateLocation(String location) {
		this.location = location;
	}
}

