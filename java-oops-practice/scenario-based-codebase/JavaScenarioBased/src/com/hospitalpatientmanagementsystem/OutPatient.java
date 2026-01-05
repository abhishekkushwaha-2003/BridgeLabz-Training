package com.hospitalpatientmanagementsystem;

//outpatient class
class OutPatient extends Patient {

	private double consultationFee;

	OutPatient(int id, String name, int age, double fee) {
		super(id, name, age);
		this.consultationFee = fee;
	}

	double getConsultationFee() {
		return consultationFee;
	}

	void displayInfo() {
		getSummary();
		System.out.println("Patient Type: OutPatient");
	}
}

