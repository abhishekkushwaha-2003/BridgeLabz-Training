package com.cabbygoapp;

//sedan cab class
class SedanCab extends Vehicle {

	private final double baseFare = 80;
	private final double rate = 15;

	SedanCab(String vehicleNumber) {
		super(vehicleNumber, 4, "Sedan");
	}

	public void bookRide(double distance) {
		double totalFare = baseFare + distance * rate;
		setFare(totalFare);
		System.out.println("Sedan ride booked");
	}

	public void endRide() {
		System.out.println("Sedan ride ended");
		System.out.println("Fare: ₹" + getFare());
	}
}
