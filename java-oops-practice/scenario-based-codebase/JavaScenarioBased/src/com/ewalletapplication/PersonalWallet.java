package com.ewalletapplication;

//personal wallet
class PersonalWallet extends Wallet {

	// constructor with referral bonus
	PersonalWallet(double balance) {
		super(balance + 50); // referral bonus
	}

	// transfer logic
	public void transferTo(User receiver, double amount) {

		if (amount <= getBalance()) {
			setBalance(getBalance() - amount);
			receiver.getWallet().setBalance(
				receiver.getWallet().getBalance() + amount
			);
			System.out.println("Transfer successful (Personal Wallet)");
		} else {
			System.out.println("Insufficient balance");
		}
	}
}
