package com.collection.ScenarioBased.ImplementShoppingCart;

import java.util.LinkedHashMap;
import java.util.Map;

// This class maintains the order of items added to cart
class CartOrderTracker {

    private Map<String, Integer> cartItems = new LinkedHashMap<>();

    // Add item to cart
    void addItem(String product, int price) {
        cartItems.put(product, price);
    }

    // Display cart items in insertion order
    void displayCart() {
        System.out.println("Cart Items (Insertion Order):");
        for (Map.Entry<String, Integer> entry : cartItems.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    // Return cart items
    Map<String, Integer> getCartItems() {
        return cartItems;
    }
}

