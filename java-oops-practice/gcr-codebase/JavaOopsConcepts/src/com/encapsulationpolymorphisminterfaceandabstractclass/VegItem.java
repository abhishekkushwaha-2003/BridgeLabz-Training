package com.encapsulationpolymorphisminterfaceandabstractclass;

//veg food item class
class VegItem extends FoodItem implements Discountable {

	VegItem(String name, double price, int qty) {
		super(name, price, qty);
	}

	// calculate total price for veg item
	double calculateTotalPrice() {
		return getPrice() * getQuantity();
	}

	// apply discount
	public double applyDiscount() {
		// flat 10% discount
		return calculateTotalPrice() * 0.10;
	}

	// discount details
	public String getDiscountDetails() {
		return "10% discount on Veg Items";
	}
}

