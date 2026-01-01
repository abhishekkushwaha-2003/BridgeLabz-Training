package com.inheritance.hybridinheritance;

	// ElectricVehicle class
	class ElectricVehicle extends Vehicle {

		// unique attribute
		int batteryCapacity;

		ElectricVehicle(String model, int maxSpeed, int batteryCapacity) {
			super(model, maxSpeed);
			this.batteryCapacity = batteryCapacity;
		}

		// method specific to electric vehicle
		void charge() {
			System.out.println("Electric vehicle is charging.");
		}
	}

