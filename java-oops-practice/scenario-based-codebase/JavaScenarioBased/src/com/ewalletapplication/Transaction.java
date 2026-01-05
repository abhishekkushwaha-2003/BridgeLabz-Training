package com.ewalletapplication;

//transaction class
class Transaction {

	static void showBalance(User user) {
		System.out.println(
			user.getName() + " Balance: " + user.getWallet().getBalance()
		);
	}
}

