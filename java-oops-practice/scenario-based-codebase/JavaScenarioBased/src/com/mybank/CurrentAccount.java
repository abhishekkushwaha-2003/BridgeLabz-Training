package com.mybank;

//current account class
class CurrentAccount extends Account {

	private double interestRate = 1.5;

	CurrentAccount(int accountNumber) {
		super(accountNumber);
	}

	// interest calculation for current account
	void calculateInterest() {
		double interest = checkBalance() * interestRate / 100;
		System.out.println("Current Account Interest: " + interest);
	}
}
