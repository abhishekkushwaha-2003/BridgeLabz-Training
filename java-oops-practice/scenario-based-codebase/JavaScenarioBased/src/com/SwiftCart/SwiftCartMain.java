package com.SwiftCart;

import java.util.ArrayList;

public class SwiftCartMain {

	public static void main(String[] args) {

		// creating products
		Product p1 = new PerishableProduct("Apple", 100, 2);
		Product p2 = new NonPerishableProduct("Rice", 60, 5);
		Product p3 = new PerishableProduct("Milk", 50, 3);

		// adding products to list
		ArrayList<Product> itemList = new ArrayList<>();
		itemList.add(p1);
		itemList.add(p2);
		itemList.add(p3);

		// creating cart with items
		Cart cart = new Cart(itemList);

		// generating bill
		cart.generateBill();
	}
}

