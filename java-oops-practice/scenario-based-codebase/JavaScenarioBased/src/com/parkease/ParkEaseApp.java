package com.parkease;

//Main class to test ParkEase system
public class ParkEaseApp {

 public static void main(String[] args) {

     // Creating vehicle objects
     Vehicle car = new Car("UP32CAR1234");
     Vehicle bike = new Bike("UP32BIKE5678");

     // Creating parking slots
     ParkingSlot slot1 = new ParkingSlot("S1", "Car");
     ParkingSlot slot2 = new ParkingSlot("S2", "Bike");

     // Occupying parking slots
     slot1.occupySlot(car);
     slot2.occupySlot(bike);

     // Calculating parking charges
     System.out.println("Car Charges: ₹" + car.calculateCharges(6));
     System.out.println("Bike Charges: ₹" + bike.calculateCharges(3));

     // Vacating slots
     slot1.vacateSlot();
     slot2.vacateSlot();

     // Viewing booking logs
     System.out.println("\n--- Parking Slot Logs ---");
     System.out.println(slot1.getBookingLog());
     System.out.println(slot2.getBookingLog());
 }
}

