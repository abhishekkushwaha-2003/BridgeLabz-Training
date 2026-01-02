package com.encapsulationpolymorphisminterfaceandabstractclass;

import java.util.ArrayList;

public class FoodDeliveryApp {

	// common method to process order
	static void processOrder(ArrayList<FoodItem> orderList) {

		double grandTotal = 0;

		// loop through all food items
		for (FoodItem item : orderList) {

			item.getItemDetails();

			double totalPrice = item.calculateTotalPrice();
			System.out.println("Total Price: " + totalPrice);

			// checking discount
			if (item instanceof Discountable) {
				Discountable d = (Discountable) item;
				double discount = d.applyDiscount();
				System.out.println(d.getDiscountDetails());
				System.out.println("Discount: " + discount);

				totalPrice = totalPrice - discount;
			}

			System.out.println("Final Price: " + totalPrice);
			System.out.println("-----------------------------");

			grandTotal += totalPrice;
		}

		System.out.println("Grand Total Bill: " + grandTotal);
	}

	public static void main(String[] args) {

		// list for storing order items
		ArrayList<FoodItem> order = new ArrayList<>();

		// adding food items
		order.add(new VegItem("Paneer Pizza", 200, 2));
		order.add(new NonVegItem("Chicken Burger", 150, 1));

		// process order
		processOrder(order);
	}
}
