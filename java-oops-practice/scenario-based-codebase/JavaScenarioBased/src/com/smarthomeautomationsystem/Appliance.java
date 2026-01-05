package com.smarthomeautomationsystem;

//abstract appliance class
abstract class Appliance implements Controllable {

	public class SmartHomeMain {
	
	}

	private String name;
	private int powerUsage; // in watts
	private boolean status; // on or off

	// constructor
	Appliance(String name, int powerUsage) {
		this.name = name;
		this.powerUsage = powerUsage;
		this.status = false; // default off
	}

	// getters
	public String getName() {
		return name;
	}

	public int getPowerUsage() {
		return powerUsage;
	}

	public boolean isOn() {
		return status;
	}

	// protected setter
	protected void setStatus(boolean status) {
		this.status = status;
	}

	// common method
	public void showStatus() {
		if (status) {
			System.out.println(name + " is ON");
		} else {
			System.out.println(name + " is OFF");
		}
	}
}

