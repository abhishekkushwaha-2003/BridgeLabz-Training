package com.hospitalpatientmanagementsystem;

//inpatient class
class InPatient extends Patient {

	private int daysAdmitted;
	private double dailyCharge;

	InPatient(int id, String name, int age, int days, double charge) {
		super(id, name, age);
		this.daysAdmitted = days;
		this.dailyCharge = charge;
	}

	// helper method
	double calculateRoomCharge() {
		return daysAdmitted * dailyCharge;
	}

	// overridden method
	void displayInfo() {
		getSummary();
		System.out.println("Patient Type: InPatient");
		System.out.println("Days Admitted: " + daysAdmitted);
	}
}
