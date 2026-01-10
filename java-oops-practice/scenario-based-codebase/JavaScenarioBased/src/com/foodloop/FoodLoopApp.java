package com.foodloop;

public class FoodLoopApp {

    // Main method – program starts here
    public static void main(String[] args) {

        // Step 1: Create food items
        FoodItem burger = new NonVegItem("Chicken Burger", 250, 10);
        FoodItem pizza = new VegItem("Veg Pizza", 300, 15);
        FoodItem fries = new VegItem("French Fries", 150, 20);

        // Step 2: Create a new order
        Order order = new Order();

        // Step 3: Add food items to the order
        order.addItem(burger);
        order.addItem(pizza);
        order.addItem(fries);

        // Step 4: Place the order
        // Discount will be applied based on total amount
        order.placeOrder();

        // Step 5: Cancel the order (optional)
        // order.cancelOrder();
    }
}
