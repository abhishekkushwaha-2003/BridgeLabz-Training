package com.encapsulationpolymorphisminterfaceandabstractclass;

//abstract bank account class
abstract class BankAccount {

	// private fields (secured)
	private int accountNumber;
	private String holderName;
	private double balance;

	// constructor
	BankAccount(int accountNumber, String holderName, double balance) {
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		this.balance = balance;
	}

	// getters (no direct access)
	int getAccountNumber() {
		return accountNumber;
	}

	String getHolderName() {
		return holderName;
	}

	double getBalance() {
		return balance;
	}

	// deposit money
	void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Amount Deposited: " + amount);
		}
	}

	// withdraw money
	void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Amount Withdrawn: " + amount);
		} else {
			System.out.println("Insufficient Balance");
		}
	}

	// abstract method for interest
	abstract double calculateInterest();
}
