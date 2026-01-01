package com.inheritance.hierarchicalinheritance;

//Superclass
class BankAccount {

	// common attributes
	String accountNumber;
	double balance;

	// constructor
	BankAccount(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	// common method
	void displayDetails() {
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Balance: " + balance);
	}
}
