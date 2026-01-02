package com.encapsulationpolymorphisminterfaceandabstractclass;

//current account class
class CurrentAccount extends BankAccount implements Loanable {

	CurrentAccount(int accNo, String name, double balance) {
		super(accNo, name, balance);
	}

	// interest calculation for current
	double calculateInterest() {
		return getBalance() * 0.02;
	}

	// loan related methods
	public void applyForLoan() {
		System.out.println("Loan applied from Current Account");
	}

	public double calculateLoanEligibility() {
		return getBalance() * 8;
	}
}
