package com.inheritance.multilevelinhertance;

//Base class
class Order {

	// common attributes
	int orderId;
	String orderDate;

	// constructor
	Order(int orderId, String orderDate) {
		this.orderId = orderId;
		this.orderDate = orderDate;
	}

	// method to get order status
	String getOrderStatus() {
		return "Order Placed";
	}
}
