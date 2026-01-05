package com.smarthomeautomationsystem;

//fan appliance
class Fan extends Appliance {

	// constructor
	Fan(int powerUsage) {
		super("Fan", powerUsage);
	}

	public void turnOn() {
		setStatus(true);
		System.out.println("Fan started rotating");
	}

	public void turnOff() {
		setStatus(false);
		System.out.println("Fan stopped");
	}
}
