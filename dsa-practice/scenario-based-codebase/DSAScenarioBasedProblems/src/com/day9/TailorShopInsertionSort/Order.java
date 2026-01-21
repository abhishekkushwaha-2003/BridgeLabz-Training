package com.day9.TailorShopInsertionSort;

public class Order {
	String orderId;
	int deliveryDay;
	
	Order(String orderId, int deliveryDay){
		this.orderId=orderId;
		this.deliveryDay=deliveryDay;
	}
	
	public void display() {
		System.out.println("Order ID : "+orderId+", Delivery Day : "+deliveryDay);
	}

}
