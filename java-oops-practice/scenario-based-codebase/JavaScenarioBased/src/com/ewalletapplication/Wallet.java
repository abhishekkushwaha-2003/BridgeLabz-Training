package com.ewalletapplication;

//abstract wallet class
abstract class Wallet implements Transferrable {

	private double balance;

	// constructor
	Wallet(double balance) {
		this.balance = balance;
	}

	// encapsulated getter
	public double getBalance() {
		return balance;
	}

	// protected setter for subclasses
	protected void setBalance(double balance) {
		this.balance = balance;
	}

	// load money into wallet
	public void loadMoney(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Money loaded: " + amount);
		}
	}
}

