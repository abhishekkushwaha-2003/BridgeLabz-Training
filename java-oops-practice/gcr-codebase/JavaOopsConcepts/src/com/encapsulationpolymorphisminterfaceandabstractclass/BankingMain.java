package com.encapsulationpolymorphisminterfaceandabstractclass;

import java.util.ArrayList;

public class BankingMain {
	public static void main(String[] args) {

		// list of bank accounts
		ArrayList<BankAccount> accounts = new ArrayList<>();

		// adding accounts
		accounts.add(new SavingsAccount(101, "Rohan", 50000));
		accounts.add(new CurrentAccount(102, "Aman", 80000));

		// loop through accounts
		for (BankAccount acc : accounts) {

			System.out.println("Account Holder: " + acc.getHolderName());
			System.out.println("Balance: " + acc.getBalance());

			// calculate interest
			System.out.println("Interest: " + acc.calculateInterest());

			// checking loan facility
			if (acc instanceof Loanable) {
				Loanable loan = (Loanable) acc;
				loan.applyForLoan();
				System.out.println("Loan Eligibility: " + loan.calculateLoanEligibility());
			}

			System.out.println("--------------------------------");
		}
	}
}
