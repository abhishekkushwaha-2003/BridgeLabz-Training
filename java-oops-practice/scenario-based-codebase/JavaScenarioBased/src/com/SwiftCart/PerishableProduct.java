package com.SwiftCart;

//perishable product like fruits, milk etc
class PerishableProduct extends Product {

	// constructor
	PerishableProduct(String name, double price, int quantity) {
		super(name, price, "Perishable", quantity);
	}

	// more discount for perishable items
	double getDiscount() {
		return getTotalPrice() * 0.10; // 10% discount
	}
}
