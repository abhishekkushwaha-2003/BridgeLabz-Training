package com.ewalletapplication;

public class EWalletMain {
		public static void main(String[] args) {

			Wallet w1 = new PersonalWallet(500);
			Wallet w2 = new BusinessWallet(1000);

			User u1 = new User(1, "Rajeev", w1);
			User u2 = new User(2, "Anuj", w2);

			Transaction.showBalance(u1);
			Transaction.showBalance(u2);

			// polymorphic call
			u1.getWallet().transferTo(u2, 200);

			Transaction.showBalance(u1);
			Transaction.showBalance(u2);
		}
	}

