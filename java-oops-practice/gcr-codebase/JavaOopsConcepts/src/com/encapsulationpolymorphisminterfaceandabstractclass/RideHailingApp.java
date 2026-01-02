package com.encapsulationpolymorphisminterfaceandabstractclass;

import java.util.ArrayList;

public class RideHailingApp {

	// method to calculate fare using polymorphism
	static void calculateRideFare(ArrayList<RideVehicle> vehicles, double distance) {

		for (RideVehicle v : vehicles) {
			v.getVehicleDetails();
			System.out.println("Distance: " + distance + " km");
			System.out.println("Total Fare: " + v.calculateFare(distance));
			System.out.println("----------------------");
		}
	}

	public static void main(String[] args) {

		RideCar car = new RideCar(1, "Amit", 15);
		car.updateLocation("MG Road");

		RideBike bike = new RideBike(2, "Rohit", 8);
		bike.updateLocation("Station Road");

		RideAuto auto = new RideAuto(3, "Suresh", 10);
		auto.updateLocation("Bus Stand");

		ArrayList<RideVehicle> list = new ArrayList<>();
		list.add(car);
		list.add(bike);
		list.add(auto);

		calculateRideFare(list, 10);
	}
}

