package com.day5.insertionsort.robowarehouse;

public class RoboWarehouse {
	public static void insertionSortByWeight(Package[] packages) {
		for(int i=1; i<packages.length;i++) {
			Package key = packages[i];
			int j = i-1;
			
			while(j >= 0 && packages[j].weight > key.weight) {
				packages[j + 1] = packages[j];
				j--;
			}
			// insert packages at corrrect position
			packages[j + 1] = key;
		}
	}
	
	public static void displayPackages(Package[] packages) {
		for(Package p : packages) {
			p.display();
		}
	}

}
