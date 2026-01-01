package com.inheritance.multilevelinhertance;

//Subclass ShippedOrder (extends Order)
class ShippedOrder extends Order {

	// additional attribute
	String trackingNumber;

	// constructor
	ShippedOrder(int orderId, String orderDate, String trackingNumber) {
		super(orderId, orderDate);
		this.trackingNumber = trackingNumber;
	}

	// overriding getOrderStatus()
	String getOrderStatus() {
		return "Order Shipped (Tracking No: " + trackingNumber + ")";
	}
}

