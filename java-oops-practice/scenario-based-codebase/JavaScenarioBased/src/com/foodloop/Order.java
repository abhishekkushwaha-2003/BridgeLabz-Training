package com.foodloop;

import java.util.ArrayList;
import java.util.List;

// Order class representing a food order
public class Order implements IOrderable {

    // List of food items in the order
    private List<FoodItem> items;

    // Total order amount
    private double total;

    // Order status
    private boolean isPlaced;

    // Constructor to create empty order
    public Order() {
        items = new ArrayList<>();
        total = 0;
        isPlaced = false;
    }

    // Method to add item to order
    public void addItem(FoodItem item) {
        items.add(item);
        total += item.getPrice();
    }

    // Method to apply discount based on total amount
    private double applyDiscount() {

        // Polymorphism via logic variation
        if (total >= 1000) {
            return total * 0.20; // 20% discount
        } else if (total >= 500) {
            return total * 0.10; // 10% discount
        }
        return 0;
    }

    // Place order implementation
    @Override
    public void placeOrder() {

        // Calculate discount
        double discount = applyDiscount();

        // Final amount after discount
        double finalAmount = total - discount;

        isPlaced = true;

        System.out.println("Order placed successfully ✅");
        System.out.println("Total Amount: ₹" + finalAmount);
    }

    // Cancel order implementation
    @Override
    public void cancelOrder() {

        if (isPlaced) {
            System.out.println("Order cancelled ❌");
            isPlaced = false;
        } else {
            System.out.println("Order not placed yet");
        }
    }
}
