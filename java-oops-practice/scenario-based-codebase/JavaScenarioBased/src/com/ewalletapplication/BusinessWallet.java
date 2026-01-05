package com.ewalletapplication;

//business wallet
class BusinessWallet extends Wallet {

	private static final double TAX = 0.02; // 2% tax

	// constructor
	BusinessWallet(double balance) {
		super(balance);
	}

	// transfer logic with tax
	public void transferTo(User receiver, double amount) {

		double taxAmount = amount * TAX;
		double totalDeduction = amount + taxAmount;

		if (totalDeduction <= getBalance()) {
			setBalance(getBalance() - totalDeduction);
			receiver.getWallet().setBalance(
				receiver.getWallet().getBalance() + amount
			);
			System.out.println("Transfer successful (Business Wallet)");
		} else {
			System.out.println("Insufficient balance");
		}
	}
}

