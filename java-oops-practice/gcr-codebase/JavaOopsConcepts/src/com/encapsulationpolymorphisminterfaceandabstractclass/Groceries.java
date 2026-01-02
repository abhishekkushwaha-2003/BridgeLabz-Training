package com.encapsulationpolymorphisminterfaceandabstractclass;

//grocery product
class Groceries extends Product {

	Groceries(int id, String name, double price) {
		super(id, name, price);
	}

	// discount for groceries
	double calculateDiscount() {
		return getPrice() * 0.05;
	}
}
