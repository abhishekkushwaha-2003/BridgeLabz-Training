package com.mybank;

//savings account class
class SavingsAccount extends Account {

	public class CurrentAccount {

	}

	private double interestRate = 4.0;

	SavingsAccount(int accountNumber, double balance) {
		super(accountNumber, balance);
	}

	// interest calculation for savings account
	void calculateInterest() {
		double interest = checkBalance() * interestRate / 100;
		System.out.println("Savings Account Interest: " + interest);
	}
}
