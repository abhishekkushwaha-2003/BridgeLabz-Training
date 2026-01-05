package com.vehiclerentalapplication;

//customer class
class Customer {

	private int customerId;
	private String customerName;

	// constructor
	Customer(int id, String name) {
		this.customerId = id;
		this.customerName = name;
	}

	void displayCustomer() {
		System.out.println("Customer ID: " + customerId);
		System.out.println("Customer Name: " + customerName);
	}
}

