package com.hospitalpatientmanagementsystem;

//doctor class
class Doctor {

	private String doctorName;
	private String specialization;

	Doctor(String name, String specialization) {
		this.doctorName = name;
		this.specialization = specialization;
	}

	void displayInfo() {
		System.out.println("Doctor Name: " + doctorName);
		System.out.println("Specialization: " + specialization);
	}
}
