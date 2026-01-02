package com.encapsulationpolymorphisminterfaceandabstractclass;

public class ECommerceMain {

		// method to calculate final price
		static void printFinalPrice(Product p) {

			double tax = 0;

			// checking tax applicable or not
			if (p instanceof Taxable) {
				tax = ((Taxable)p).calculateTax();
			}

			double discount = p.calculateDiscount();
			double finalPrice = p.getPrice() + tax - discount;

			System.out.println("Product: " + p.getName());
			System.out.println("Final Price: " + finalPrice);
			System.out.println();
		}

		public static void main(String[] args) {

			Product p1 = new Electronics(101, "Laptop", 50000);
			Product p2 = new Clothing(102, "Jacket", 3000);
			Product p3 = new Groceries(103, "Rice", 1000);

			printFinalPrice(p1);
			printFinalPrice(p2);
			printFinalPrice(p3);
		}
	}

