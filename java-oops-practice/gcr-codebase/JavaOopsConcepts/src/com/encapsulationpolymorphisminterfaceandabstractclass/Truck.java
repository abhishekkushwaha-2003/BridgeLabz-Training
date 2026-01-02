package com.encapsulationpolymorphisminterfaceandabstractclass;

//truck class
class Truck extends Vehicle implements Insurable {

	Truck(String number, double rate, String policyNo) {
		super(number, "Truck", rate, policyNo);
	}

	// rental cost for truck
	double calculateRentalCost(int days) {
		return (getRentalRate() * days) + 1000;
	}

	// insurance for truck
	public double calculateInsurance() {
		return 1000;
	}

	public String getInsuranceDetails() {
		return "Truck insurance applied";
	}
}
