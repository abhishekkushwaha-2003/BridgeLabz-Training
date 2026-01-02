package com.encapsulationpolymorphisminterfaceandabstractclass;

//bike class
class Bike extends Vehicle implements Insurable {

	Bike(String number, double rate, String policyNo) {
		super(number, "Bike", rate, policyNo);
	}

	// rental cost for bike
	double calculateRentalCost(int days) {
		return getRentalRate() * days;
	}

	// insurance for bike
	public double calculateInsurance() {
		return 200;
	}

	public String getInsuranceDetails() {
		return "Bike insurance applied";
	}
}

