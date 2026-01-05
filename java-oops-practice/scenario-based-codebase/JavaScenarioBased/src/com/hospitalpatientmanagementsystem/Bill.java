package com.hospitalpatientmanagementsystem;

//bill class
class Bill implements Payable {

	private double amount;
	private double tax;
	private double discount;

	Bill(double amount) {
		this.amount = amount;
	}

	// helper method to calculate tax
	double calculateTax() {
		return amount * 0.05;
	}

	// helper method to calculate discount
	double calculateDiscount() {
		return amount * 0.10;
	}

	// interface method
	public double calculatePayment() {
		tax = calculateTax();
		discount = calculateDiscount();
		return amount + tax - discount;
	}
}

