package com.constructorandaccessmodifier.level1;

// BankAccountMain class
// this class contains the main method
public class BankAccountMain {

	    public static void main(String[] args) {

	        // creating BankAccount object
	        BankAccount acc1 =
	                new BankAccount(1234567890L, "Amit Kumar", 5000);

	        System.out.println("Bank Account Details:");
	        acc1.displayAccount();

	        // updating balance using setter method
	        acc1.setBalance(7500);

	        System.out.println("\nAfter Balance Update:");
	        acc1.displayAccount();

	        // creating SavingsAccount object
	        SavingsAccount sa1 =
	                new SavingsAccount(9876543210L, "Rohit Sharma", 10000, 4.5);

	        System.out.println("\nSavings Account Details:");
	        sa1.displaySavingsAccount();
	    }
	}

