package com.SwiftCart;

//base product class
abstract class Product {

	protected String name;
	protected double price;
	protected String category;
	protected int quantity;

	// constructor
	Product(String name, double price, String category, int quantity) {
		this.name = name;
		this.price = price;
		this.category = category;
		this.quantity = quantity;
	}

	// abstract method for discount (polymorphism)
	abstract double getDiscount();

	// calculate total price of product
	double getTotalPrice() {
		return price * quantity;
	}
}
