package com.cabbygoapp;

//suv cab class
class SuvCab extends Vehicle {

	private final double baseFare = 120;
	private final double rate = 20;

	SuvCab(String vehicleNumber) {
		super(vehicleNumber, 6, "SUV");
	}

	public void bookRide(double distance) {
		double totalFare = baseFare + distance * rate;
		setFare(totalFare);
		System.out.println("SUV ride booked");
	}

	public void endRide() {
		System.out.println("SUV ride ended");
		System.out.println("Fare: ₹" + getFare());
	}
}


