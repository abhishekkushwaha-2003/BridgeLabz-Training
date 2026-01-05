package com.ewalletapplication;

//user class
class User {

	private int userId;
	private String name;
	private Wallet wallet;

	// constructor
	User(int userId, String name, Wallet wallet) {
		this.userId = userId;
		this.name = name;
		this.wallet = wallet;
	}

	// getter
	public Wallet getWallet() {
		return wallet;
	}

	public String getName() {
		return name;
	}
}

