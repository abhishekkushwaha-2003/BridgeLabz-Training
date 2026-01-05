package com.mybank;

public class MyBankMain {

		public static void main(String[] args) {

			// creating savings account object
			Account acc1 = new SavingsAccount(101, 5000);

			// creating current account object
			Account acc2 = new CurrentAccount(202);

			// deposit operations
			acc1.deposit(2000);
			acc2.deposit(3000);

			System.out.println();

			// withdraw operations
			acc1.withdraw(1000);
			acc2.withdraw(500);

			System.out.println();

			// checking balance
			System.out.println("Savings Balance: " + acc1.checkBalance());
			System.out.println("Current Balance: " + acc2.checkBalance());

			System.out.println();

			// calculating interest (polymorphism)
			acc1.calculateInterest();
			acc2.calculateInterest();
		}
	}

