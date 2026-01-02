package com.encapsulationpolymorphisminterfaceandabstractclass;

//ride bike class
class RideBike extends RideVehicle implements GPS {

	private String location;

	RideBike(int id, String driver, double rate) {
		super(id, driver, rate);
	}

	// bike fare calculation
	double calculateFare(double distance) {
		return distance * getRatePerKm();
	}

	public void getCurrentLocation() {
		System.out.println("Bike Location: " + location);
	}

	public void updateLocation(String location) {
		this.location = location;
	}
}
