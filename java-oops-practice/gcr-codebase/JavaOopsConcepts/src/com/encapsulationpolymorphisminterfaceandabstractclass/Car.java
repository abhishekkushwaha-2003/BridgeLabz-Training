package com.encapsulationpolymorphisminterfaceandabstractclass;

//car class
class Car extends Vehicle implements Insurable {

	Car(String number, double rate, String policyNo) {
		super(number, "Car", rate, policyNo);
	}

	// rental cost for car
	double calculateRentalCost(int days) {
		return getRentalRate() * days;
	}

	// insurance for car
	public double calculateInsurance() {
		return 500;
	}

	public String getInsuranceDetails() {
		return "Car insurance applied";
	}
}

