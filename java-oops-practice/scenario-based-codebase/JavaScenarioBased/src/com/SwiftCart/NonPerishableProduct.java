package com.SwiftCart;

//non-perishable product like rice, oil etc
class NonPerishableProduct extends Product {

	// constructor
	NonPerishableProduct(String name, double price, int quantity) {
		super(name, price, "Non-Perishable", quantity);
	}

	// less discount
	double getDiscount() {
		return getTotalPrice() * 0.05; // 5% discount
	}
}
