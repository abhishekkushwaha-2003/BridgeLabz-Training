package com.cabbygoapp;

public class CabbyGoApp {

	public static void main(String[] args) {

		Driver driver = new Driver("Ramesh", "DL12345", 4.7);

		Vehicle v1 = new MiniCab("UP32AB1234");
		Vehicle v2 = new SedanCab("UP32CD5678");

		// polymorphism
		v1.bookRide(8);
		v1.endRide();

		System.out.println();

		v2.bookRide(10);
		v2.endRide();

		System.out.println("\nDriver Name: " + driver.getName());
		System.out.println("Driver Rating: " + driver.getRating());
	}
}

