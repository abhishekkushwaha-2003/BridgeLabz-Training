package com.objectmodelingandobjectdiagram.selfproblem;

public class EcommerceMain {

	    public static void main(String[] args) {

	        // creating products
	        Product p1 = new Product("Mobile Phone", 15000);
	        Product p2 = new Product("Headphones", 2000);
	        Product p3 = new Product("Charger", 800);

	        // creating order
	        Order order1 = new Order(101);

	        // adding products to order
	        order1.addProduct(p1);
	        order1.addProduct(p2);
	        order1.addProduct(p3);

	        // creating customer
	        Customer customer = new Customer("Rohan");

	        // customer placing order (communication)
	        customer.placeOrder(order1);
	    }
	}
