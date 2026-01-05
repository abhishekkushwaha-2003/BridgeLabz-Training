package com.mybank;

//interface for basic banking transactions
interface ITransaction {

	void deposit(double amount);

	void withdraw(double amount);

	double checkBalance();
}
