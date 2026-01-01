package com.inheritance.hierarchicalinheritance;

//Subclass SavingsAccount
class SavingsAccount extends BankAccount {

	// unique attribute
	double interestRate;

	SavingsAccount(String accountNumber, double balance, double interestRate) {
		super(accountNumber, balance);
		this.interestRate = interestRate;
	}

	// displaying account type
	void displayAccountType() {
		System.out.println("Account Type: Savings Account");
		System.out.println("Interest Rate: " + interestRate + "%");
	}
}
