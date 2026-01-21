package com.day9.TailorShopInsertionSort;

public class TailorShopApp {
	public static void main(String [] args) {
		Order [] orders = {
				new Order("ORDER1",8),
				new Order("ORDER2",2),
				new Order("ORDER3",4),
				new Order("ORDER4",9),
				new Order("ORDER5",3),
				
		};
		// display order before sorting 
		System.out.println("Before Sorting : ");
		TailorShop.displayOrder(orders);
		
		// sort the orders
		TailorShop.insertionSort(orders);
		
		// displaying after sorting 
		System.out.println("\nAfter Sorting : ");
		TailorShop.displayOrder(orders);
	}

}
