import java.util.Scanner;

public class PhoneRechargeSimulator {
    public static void main(String[] args) {

        // create Scanner object
        Scanner sc = new Scanner(System.in);

        // variable to store total balance
        int balance = 0;

        char choice;

        // loop to allow repeated recharge
        do {
            System.out.println("Enter your mobile operator : ");
	        System.out.println("1. for Jio, \n2. for Airtel, \n3. for BSNL, \n4. for Vi");

            int operator = sc.nextInt();

            // taking recharge amount
            System.out.print("Enter recharge amount: ");
            int amount = sc.nextInt();

            // adding amount to balance
            balance += amount;

            // switch case to show offers
            switch (operator) {
                case 1:
                    System.out.println("Jio Offer: 1.5GB/day for 28 days");
                    break;

                case 2:
                    System.out.println("Airtel Offer: 2GB/day + Unlimited Calls");
                    break;

                case 3:
                    System.out.println("VI Offer: 1GB/day + Weekend Data Rollover");
                    break;

                case 4:
                    System.out.println("BSNL Offer: 100 SMS/day + Talktime");
                    break;

                default:
                    System.out.println("Invalid operator selected");
            }

            // showing balance after recharge
            System.out.println("Current Balance: Rs. " + balance);

            // asking user if they want to recharge again
            System.out.println();
            System.out.print("Do you want to recharge again? (y/n): ");
            choice = sc.next().toLowerCase().charAt(0);

            System.out.println("--------------------------------");

        } while (choice == 'y');

        System.out.println("Thank you for using Phone Recharge Simulator!");

        sc.close();
    }
}