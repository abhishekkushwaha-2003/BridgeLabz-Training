package com.day8.FoodFestMergeSort;

// Create a class Stall 
public class Stall {
	
	String stallName;
	int footfall;
	
	public Stall(String stallName, int footfall) {
		this.stallName = stallName;
		this.footfall = footfall;
	}
	
	// method to display stall details
	public void display() {
		System.out.println("Stall : "+stallName+", Footfall "+footfall);
	} 

}
