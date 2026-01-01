package com.inheritance.singleinhertance;

//Subclass Thermostat
class Thermostat extends Device {

	// additional attribute
	int temperatureSetting;

	// constructor
	Thermostat(String deviceId, boolean status, int temperatureSetting) {
		super(deviceId, status);
		this.temperatureSetting = temperatureSetting;
	}

	// overriding displayStatus()
	void displayStatus() {
		super.displayStatus();
		System.out.println("Temperature Setting: " + temperatureSetting + "°C");
	}
}
