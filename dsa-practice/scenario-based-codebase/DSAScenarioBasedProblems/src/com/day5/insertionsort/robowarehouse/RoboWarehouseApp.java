package com.day5.insertionsort.robowarehouse;

public class RoboWarehouseApp {
	public static void main(String [] args) {
		// create object array
		Package[] packages = {
				new Package(101, 18.0),
				new Package(102, 23.0),
				new Package(103, 15.4),
				new Package(104, 13.34),
				new Package(105, 17.6)
		};
		// displaying details before sorting 
		System.out.println("Before Sorting : ");
		RoboWarehouse.displayPackages(packages);
		
		// displaying details after sorting 
		RoboWarehouse.insertionSortByWeight(packages);
		System.out.println("\nAfter Sorting By Weight : ");
		RoboWarehouse.displayPackages(packages);
		
	}
}
