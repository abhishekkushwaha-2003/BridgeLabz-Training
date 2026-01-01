package com.inheritance.hierarchicalinheritance;

//Subclass FixedDepositAccount
class FixedDepositAccount extends BankAccount {

	// unique attribute
	int tenure;   // in years

	FixedDepositAccount(String accountNumber, double balance, int tenure) {
		super(accountNumber, balance);
		this.tenure = tenure;
	}

	// displaying account type
	void displayAccountType() {
		System.out.println("Account Type: Fixed Deposit Account");
		System.out.println("Tenure: " + tenure + " years");
	}
}
