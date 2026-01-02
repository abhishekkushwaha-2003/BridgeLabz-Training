package com.encapsulationpolymorphisminterfaceandabstractclass;

//clothing product
class Clothing extends Product implements Taxable {

	Clothing(int id, String name, double price) {
		super(id, name, price);
	}

	// discount for clothing
	double calculateDiscount() {
		return getPrice() * 0.20;
	}

	// tax calculation
	public double calculateTax() {
		return getPrice() * 0.12;
	}

	public String getTaxDetails() {
		return "12% GST on Clothing";
	}
}

