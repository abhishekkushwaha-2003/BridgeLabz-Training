package com.encapsulationpolymorphisminterfaceandabstractclass;

//abstract class for food items
abstract class FoodItem {

	// private fields (encapsulation)
	private String itemName;
	private double price;
	private int quantity;

	// constructor
	FoodItem(String itemName, double price, int quantity) {
		this.itemName = itemName;
		this.price = price;
		this.quantity = quantity;
	}

	// getters (no direct access to fields)
	String getItemName() {
		return itemName;
	}

	double getPrice() {
		return price;
	}

	int getQuantity() {
		return quantity;
	}

	// abstract method for total price calculation
	abstract double calculateTotalPrice();

	// concrete method to show item details
	void getItemDetails() {
		System.out.println("Item Name: " + itemName);
		System.out.println("Price: " + price);
		System.out.println("Quantity: " + quantity);
	}
}

