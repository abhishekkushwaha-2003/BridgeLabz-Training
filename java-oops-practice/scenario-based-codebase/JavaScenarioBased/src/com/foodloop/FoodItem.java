package com.foodloop;

//Base class representing a food item
public class FoodItem {

 // Food name
 protected String name;

 // Category (Veg / Non-Veg)
 protected String category;

 // Price of the food item
 protected double price;

 // Stock availability (hidden from outside)
 private int stock;

 // Constructor to initialize food item
 public FoodItem(String name, String category, double price, int stock) {
     this.name = name;
     this.category = category;
     this.price = price;
     this.stock = stock;
 }

 // Method to reduce stock after order
 public boolean reduceStock(int quantity) {
     if (stock >= quantity) {
         stock -= quantity;
         return true;
     }
     return false;
 }

 // Getter for price
 public double getPrice() {
     return price;
 }
}
