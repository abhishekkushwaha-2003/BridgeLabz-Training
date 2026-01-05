package com.SwiftCart;

import java.util.ArrayList;

//cart class
class Cart implements ICheckout {

	// list of products
	private ArrayList<Product> products = new ArrayList<>();

	// total price should be protected
	private double totalPrice;

	// default constructor
	Cart() {
	}

	// constructor with pre-added products
	Cart(ArrayList<Product> products) {
		this.products = products;
	}

	// add product to cart
	void addProduct(Product product) {
		products.add(product);
	}

	// calculate total price
	private void calculateTotal() {
		totalPrice = 0;
		for (Product p : products) {
			totalPrice += p.getTotalPrice();
		}
	}

	// apply discount (polymorphism)
	public void applyDiscount() {
		double discount = 0;
		for (Product p : products) {
			discount += p.getDiscount();
		}
		totalPrice = totalPrice - discount;
	}

	// generate final bill
	public void generateBill() {

		// calculate total first
		calculateTotal();

		System.out.println("---- SwiftCart Bill ----");

		for (Product p : products) {
			System.out.println(
				p.name + " | Qty: " + p.quantity +
				" | Price: " + p.getTotalPrice()
			);
		}

		System.out.println("Total before discount: " + totalPrice);

		// applying discount
		applyDiscount();

		System.out.println("Final Amount to Pay: " + totalPrice);
	}
}
