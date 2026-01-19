package com.collection.ScenarioBased.ImplementShoppingCart;

class ShoppingApp {

    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

        // Add products with prices
        cart.addProduct("Laptop", 50000);
        cart.addProduct("Mouse", 500);
        cart.addProduct("Keyboard", 1500);
        cart.addProduct("Headphones", 2000);

        // Add items to cart
        cart.addToCart("Laptop");
        cart.addToCart("Mouse");
        cart.addToCart("Keyboard");
        cart.addToCart("Headphones");

        // Display cart details
        cart.showCartDetails();
    }
}
