package com.day9.MedWarehouseMergeSort;

// create a class Medicine to represent details of medicine
public class Medicine {
	String name;
	int expiryDay;
	int quantity;
	
	// constructor
	Medicine(String name, int expiryDay, int quantity ){
		this.name=name;
		this.expiryDay=expiryDay;
		this.quantity=quantity;
	}
	
	// method to display medicine details
	public void display() {
		System.out.println("Medicine : "+name+", Expiry Date : "+expiryDay+" Quantity : "+quantity);
	}

}
