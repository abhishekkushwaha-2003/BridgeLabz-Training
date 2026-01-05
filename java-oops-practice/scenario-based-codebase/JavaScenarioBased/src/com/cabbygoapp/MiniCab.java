package com.cabbygoapp;

//mini cab class
class MiniCab extends Vehicle {

	private final double baseFare = 50;
	private final double rate = 10;

	MiniCab(String vehicleNumber) {
		super(vehicleNumber, 4, "Mini");
	}

	public void bookRide(double distance) {
		double totalFare = baseFare + distance * rate;
		setFare(totalFare);
		System.out.println("Mini ride booked");
	}

	public void endRide() {
		System.out.println("Mini ride ended");
		System.out.println("Fare: ₹" + getFare());
	}
}
