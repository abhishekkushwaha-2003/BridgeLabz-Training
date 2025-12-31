/*18. Currency Exchange Kiosk 💱
Design a currency converter:
● Take INR amount and target currency.
● Use a switch to apply the correct rate.
● Ask if the user wants another conversion (do-while).*/

import java.util.Scanner;
public class CurrencyExchangeKiosk{
	public static void main(String[] args){
		//create a Scanner object to take user input
		Scanner sc = new Scanner(System.in);
		char choice;

		// do-while loop for multiple conversions
		do{
			System.out.print("Enter amount in INR: ");
			double inr = sc.nextDouble();

			System.out.println("Select target currency:");
			System.out.println("1. USD");
			System.out.println("2. EUR");
			System.out.println("3. GBP");

			int option = sc.nextInt();
			double convertedAmount = 0;

			// switch for currency conversion
			switch(option){
				case 1:
					convertedAmount = inr * 0.012;
					System.out.println("Amount in USD: " + convertedAmount);
					break;

				case 2:
					convertedAmount = inr * 0.011;
					System.out.println("Amount in EUR: " + convertedAmount);
					break;

				case 3:
					convertedAmount = inr * 0.0095;
					System.out.println("Amount in GBP: " + convertedAmount);
					break;

				default:
					System.out.println("Invalid Currency Option!");
			}

			// asking user for another conversion
			System.out.print("Do you want another conversion? (y/n): ");
			choice = sc.next().toLowerCase().charAt(0);

		}while(choice == 'y');

		sc.close();
	}
}
