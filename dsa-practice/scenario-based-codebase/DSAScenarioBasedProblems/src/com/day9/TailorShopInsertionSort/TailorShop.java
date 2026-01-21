package com.day9.TailorShopInsertionSort;

public class TailorShop {
	public static void insertionSort(Order[] orders) {
		// start from second order
		for(int i=1; i<orders.length;i++) {
			
			// new order to insert
			Order key = orders[i];
			int j=i-1;
			
			while(j>=0 && orders[j].deliveryDay > key.deliveryDay) {
				orders[j+1]=orders[j];
				j--;
			}
			
			// insert order at correct position
			orders[j+1]=key;
		}
	}
	
	// display all orders
	public static void displayOrder(Order [] orders) {
		for(Order o : orders) {
			o.display();
		}
	}
}
