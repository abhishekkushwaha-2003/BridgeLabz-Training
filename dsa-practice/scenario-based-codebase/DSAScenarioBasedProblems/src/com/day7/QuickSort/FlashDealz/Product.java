package com.day7.QuickSort.FlashDealz;

// Create a class Product to Represents a product in FlashDealz
public class Product {

 private int productId;
 private String name;
 private double discount; // discount percentage

 // Constructor
 public Product(int productId, String name, double discount) {
     this.productId = productId;
     this.name = name;
     this.discount = discount;
 }

 // Getter for discount (used in sorting)
 public double getDiscount() {
     return discount;
 }

 // Display product details
 public void display() {
     System.out.println(
         "Product ID: " + productId +
         ", Name: " + name +
         ", Discount: " + discount + "%"
     );
 }
}
