package com.encapsulationpolymorphisminterfaceandabstractclass;

import java.util.ArrayList;

public class VehicleRentalMain {
	public static void main(String[] args) {

		// creating list of vehicles
		ArrayList<Vehicle> vehicles = new ArrayList<>();

		// adding different vehicles
		vehicles.add(new Car("MH12AB1234", 2000, "CAR-101"));
		vehicles.add(new Bike("MH14XY5678", 800, "BIKE-202"));
		vehicles.add(new Truck("MH20TR9999", 5000, "TRUCK-303"));

		int days = 3;

		// loop through all vehicles
		for (Vehicle v : vehicles) {

			System.out.println("Vehicle Type: " + v.getType());
			System.out.println("Vehicle Number: " + v.getVehicleNumber());

			// calculating rental cost
			double rent = v.calculateRentalCost(days);
			System.out.println("Rental Cost for " + days + " days: " + rent);

			// checking insurance
			if (v instanceof Insurable) {
				Insurable ins = (Insurable) v;
				System.out.println("Insurance Cost: " + ins.calculateInsurance());
				System.out.println(ins.getInsuranceDetails());
			}

			System.out.println("--------------------------------");
		}
	}
}


