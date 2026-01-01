package com.inheritance.multilevelinhertance;

//Subclass DeliveredOrder (extends ShippedOrder)
class DeliveredOrder extends ShippedOrder {

	// additional attribute
	String deliveryDate;

	// constructor
	DeliveredOrder(int orderId, String orderDate,
	               String trackingNumber, String deliveryDate) {
		super(orderId, orderDate, trackingNumber);
		this.deliveryDate = deliveryDate;
	}

	// overriding getOrderStatus()
	String getOrderStatus() {
		return "Order Delivered on " + deliveryDate;
	}
}

