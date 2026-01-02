package com.encapsulationpolymorphisminterfaceandabstractclass;

//abstract product class
abstract class Product {

	// private fields
	private int productId;
	private String name;
	private double price;

	// constructor
	Product(int productId, String name, double price) {
		this.productId = productId;
		this.name = name;
		this.price = price;
	}

	// getters
	int getProductId() {
		return productId;
	}

	String getName() {
		return name;
	}

	double getPrice() {
		return price;
	}

	// setter with validation
	void setPrice(double price) {
		if (price > 0) {
			this.price = price;
		}
	}

	// abstract method
	abstract double calculateDiscount();
}
