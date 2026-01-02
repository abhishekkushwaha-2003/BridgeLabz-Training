package com.encapsulationpolymorphisminterfaceandabstractclass;

//non-veg food item class
class NonVegItem extends FoodItem implements Discountable {

	NonVegItem(String name, double price, int qty) {
		super(name, price, qty);
	}

	// calculate total price with extra charges
	double calculateTotalPrice() {
		double basePrice = getPrice() * getQuantity();
		double extraCharge = 50; // fixed non-veg charge
		return basePrice + extraCharge;
	}

	// apply discount
	public double applyDiscount() {
		// 5% discount only
		return calculateTotalPrice() * 0.05;
	}

	// discount details
	public String getDiscountDetails() {
		return "5% discount on Non-Veg Items";
	}
}
