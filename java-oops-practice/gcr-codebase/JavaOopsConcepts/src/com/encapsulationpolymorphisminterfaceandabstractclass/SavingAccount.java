package com.encapsulationpolymorphisminterfaceandabstractclass;

//savings account class
class SavingsAccount extends BankAccount implements Loanable {

	SavingsAccount(int accNo, String name, double balance) {
		super(accNo, name, balance);
	}

	// interest calculation for savings
	double calculateInterest() {
		return getBalance() * 0.04;
	}

	// loan related methods
	public void applyForLoan() {
		System.out.println("Loan applied from Savings Account");
	}

	public double calculateLoanEligibility() {
		return getBalance() * 5;
	}
}
