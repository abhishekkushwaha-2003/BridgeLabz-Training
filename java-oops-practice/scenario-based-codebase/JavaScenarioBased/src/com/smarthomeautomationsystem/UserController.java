package com.smarthomeautomationsystem;

//controller class
class UserController {

	// control any appliance (polymorphism)
	void controlAppliance(Appliance appliance) {
		appliance.turnOn();
		appliance.showStatus();
	}

	// compare power usage
	void comparePower(Appliance a1, Appliance a2) {

		if (a1.getPowerUsage() > a2.getPowerUsage()) {
			System.out.println(a1.getName() + " uses more power than " + a2.getName());
		} else if (a1.getPowerUsage() < a2.getPowerUsage()) {
			System.out.println(a2.getName() + " uses more power than " + a1.getName());
		} else {
			System.out.println("Both use same power");
		}
	}
}


