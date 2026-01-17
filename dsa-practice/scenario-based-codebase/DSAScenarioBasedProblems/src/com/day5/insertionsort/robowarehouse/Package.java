package com.day5.insertionsort.robowarehouse;

public class Package {
	int packageId;
	double weight;
	
	// create constructor
	public Package(int packageId, double weight) {
		this.packageId=packageId;
		this.weight=weight;
	}
	// method for displaying detail
	public void display() {
		System.out.println("Package ID : "+ packageId +", weight : "+ weight +" kg");
	}
}
