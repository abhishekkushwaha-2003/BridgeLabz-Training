package com.smarthomeautomationsystem;

public class SmartHomeMain {

	public static void main(String[] args) {

		Appliance light = new Light(40);
		Appliance fan = new Fan(75);
		Appliance ac = new AirConditioner(1500);

		UserController controller = new UserController();

		// polymorphic calls
		controller.controlAppliance(light);
		controller.controlAppliance(fan);
		controller.controlAppliance(ac);

		// comparing power usage
		controller.comparePower(light, ac);
	}
}
