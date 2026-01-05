package com.cabbygoapp;

//driver class
class Driver {

	private String name;
	private String licenseNumber;
	private double rating; // sensitive data

	// constructor
	Driver(String name, String licenseNumber, double rating) {
		this.name = name;
		this.licenseNumber = licenseNumber;
		this.rating = rating;
	}

	// getter methods
	public String getName() {
		return name;
	}

	public double getRating() {
		return rating;
	}
}
