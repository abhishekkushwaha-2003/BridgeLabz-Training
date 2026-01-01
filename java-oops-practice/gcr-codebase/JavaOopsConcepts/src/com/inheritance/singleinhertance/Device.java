package com.inheritance.singleinhertance;

//Superclass
class Device {

	// common attributes
	String deviceId;
	boolean status;   // true = ON, false = OFF

	// constructor
	Device(String deviceId, boolean status) {
		this.deviceId = deviceId;
		this.status = status;
	}

	// method to display device status
	void displayStatus() {
		System.out.println("Device ID: " + deviceId);
		System.out.println("Status: " + (status ? "ON" : "OFF"));
	}
}

