package com.constructorandaccessmodifier.level1;

// ProductMain class
// this class contains the main method
public class ProductMain {

	    public static void main(String[] args) {

	        // creating product objects
	        Product p1 = new Product("Laptop", 55000);
	        Product p2 = new Product("Mobile", 20000);
	        Product p3 = new Product("Headphones", 2500);

	        // displaying product details
	        System.out.println("Product 1 Details:");
	        p1.displayProductDetails();

	        System.out.println("\nProduct 2 Details:");
	        p2.displayProductDetails();

	        System.out.println("\nProduct 3 Details:");
	        p3.displayProductDetails();

	        // displaying total products using class method
	        System.out.println();
	        Product.displayTotalProducts();
	    }
	}

