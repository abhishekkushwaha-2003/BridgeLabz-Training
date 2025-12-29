package com.constructorandaccessmodifier.level1;

// Product class
// this class is used to store product details

public class Product {

	// Product class
	// this class is used to store product details

	    // instance variables (different for each object)
	    String productName;
	    double price;

	    // class variable (shared by all objects)
	    static int totalProducts = 0;

	    // constructor to initialize product details
	    Product(String productName, double price) {
	        this.productName = productName;
	        this.price = price;
	        totalProducts++;   // increase count whenever a product is created
	    }

	    // instance method
	    // used to display individual product details
	    void displayProductDetails() {
	        System.out.println("Product Name : " + productName);
	        System.out.println("Price        : Rs. " + price);
	    }

	    // class method
	    // used to display total number of products
	    static void displayTotalProducts() {
	        System.out.println("Total Products: " + totalProducts);
	    }
	}
