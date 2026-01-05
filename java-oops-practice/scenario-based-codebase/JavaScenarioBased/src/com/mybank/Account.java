package com.mybank;

//base class for all account types
abstract class Account implements ITransaction {

	// account details (encapsulation)
	protected int accountNumber;
	private double balance;

	// constructor with opening balance
	Account(int accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	// constructor without opening balance
	Account(int accountNumber) {
		this.accountNumber = accountNumber;
		this.balance = 0;
	}

	// deposit money
	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Amount Deposited: " + amount);
	}

	// withdraw money
	public void withdraw(double amount) {
		if (amount <= balance) {
			balance = balance - amount;
			System.out.println("Amount Withdrawn: " + amount);
		} else {
			System.out.println("Insufficient Balance");
		}
	}

	// check balance
	public double checkBalance() {
		return balance;
	}

	// abstract method for interest (polymorphism)
	abstract void calculateInterest();
}
