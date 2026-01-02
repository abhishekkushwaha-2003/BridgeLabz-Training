package com.encapsulationpolymorphisminterfaceandabstractclass;

//electronics product
class Electronics extends Product implements Taxable {

	Electronics(int id, String name, double price) {
		super(id, name, price);
	}

	// discount for electronics
	double calculateDiscount() {
		return getPrice() * 0.10;
	}

	// tax calculation
	public double calculateTax() {
		return getPrice() * 0.18;
	}

	public String getTaxDetails() {
		return "18% GST on Electronics";
	}
}

