package com.hospitalpatientmanagementsystem;

//abstract patient class
abstract class Patient {

	// private data (sensitive)
	private int patientId;
	private String name;
	private int age;
	private String medicalHistory;

	// constructor for normal patient
	Patient(int patientId, String name, int age) {
		this.patientId = patientId;
		this.name = name;
		this.age = age;
	}

	// overloaded constructor for emergency patient
	Patient(int patientId, String name, int age, String medicalHistory) {
		this(patientId, name, age);
		this.medicalHistory = medicalHistory;
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

	// public method to show summary
	void getSummary() {
		System.out.println("Patient ID: " + patientId);
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}

	// abstract method
	abstract void displayInfo();
}
