// Write a Java program that takes coffee type and quantity as input.
// calculates total bill using switch case, adds GST, and continues serving customers using while loop.
// The program stops when user types "exit".

import java.util.Scanner;

public class CoffeeCounterChronicles {
	public static void main(String[] args) {

		// Create a Scanner object to take input from user
		Scanner sc = new Scanner(System.in);

		// Declaring variables
		String coffeeType;
		int quantity;
		double price = 0;
		double totalBill;
		double gst;
		double finalAmount;

		// Using while loop to serve multiple customers
		while (true) {

			System.out.print("Enter Coffee Type (Espresso/Latte/Cappuccino/Mocha) or type exit to stop : ");
			coffeeType = sc.next();

			// Condition to stop the program
			if (coffeeType.equalsIgnoreCase("exit")) {
				System.out.println("Thank you for visiting the cafe!");
				break;
			}

			System.out.print("Enter Quantity : ");
			quantity = sc.nextInt();

			// Using switch case to set price based on coffee type
			
			switch (coffeeType) {
				case "Espresso":
					price = 100;
					break;

				case "Latte":
					price = 150;
					break;

				case "Cappuccino":
					price = 180;
					break;
					
				case "Mocha":
					price = 120;
					break;	

				default:
					System.out.println("Invalid Coffee Type");
					continue;
			}

			// Calculating total bill
			totalBill = price * quantity;

			// Calculating GST (5%)
			gst = totalBill * 0.05;

			// Final amount after adding GST
			finalAmount = totalBill + gst;

			// Printing bill details
			System.out.println("Total Bill : " + totalBill);
			System.out.println("GST (5%) : " + gst);
			System.out.println("Final Amount to Pay : " + finalAmount);
		}

		// Closing Scanner class
		sc.close();
	}
}
