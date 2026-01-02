package com.encapsulationpolymorphisminterfaceandabstractclass;

//abstract class for patient
abstract class Patient {

	// private fields (encapsulation)
	private int patientId;
	private String name;
	private int age;

	// sensitive data (kept private)
	private String diagnosis;
	private String medicalHistory;

	// constructor
	Patient(int patientId, String name, int age) {
		this.patientId = patientId;
		this.name = name;
		this.age = age;
	}

	// getters
	int getPatientId() {
		return patientId;
	}

	String getName() {
		return name;
	}

	int getAge() {
		return age;
	}

	// setter with control
	void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}

	void setMedicalHistory(String medicalHistory) {
		this.medicalHistory = medicalHistory;
	}

	// abstract method for bill calculation
	abstract double calculateBill();

	// concrete method to show patient details
	void getPatientDetails() {
		System.out.println("Patient ID: " + patientId);
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
}

