package com.inheritance.hierarchicalinheritance;

//Subclass CheckingAccount
class CheckingAccount extends BankAccount {

	// unique attribute
	double withdrawalLimit;

	CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
		super(accountNumber, balance);
		this.withdrawalLimit = withdrawalLimit;
	}

	// displaying account type
	void displayAccountType() {
		System.out.println("Account Type: Checking Account");
		System.out.println("Withdrawal Limit: " + withdrawalLimit);
	}
}

