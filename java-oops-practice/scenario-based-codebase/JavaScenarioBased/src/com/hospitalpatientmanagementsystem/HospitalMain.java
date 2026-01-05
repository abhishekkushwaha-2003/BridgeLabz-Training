package com.hospitalpatientmanagementsystem;

public class HospitalMain {

	// helper method to validate age
	static boolean validateUserInput(int age) {
		return age > 0;
	}

	// helper method to check bill eligibility
	static void generateBill(Payable bill) {
		System.out.println("Total Bill Amount: " + bill.calculatePayment());
	}

	public static void main(String[] args) {

		// creating doctor
		Doctor doc = new Doctor("Dr. Sharma", "Cardiologist");
		doc.displayInfo();

		System.out.println("----------------");

		// creating patients using polymorphism
		Patient p1 = new InPatient(101, "Rajeev", 25, 5, 2000);
		Patient p2 = new OutPatient(102, "Abhishek", 23, 500);

		// displaying patient info
		p1.displayInfo();
		System.out.println("----------------");
		p2.displayInfo();

		System.out.println("----------------");

		// generating bill
		Bill bill = new Bill(10000);
		generateBill(bill);
	}
}

