package com.parkease;

//Bike class extending Vehicle
public class Bike extends Vehicle {

 // Constructor for Bike
 public Bike(String vehicleNumber) {
     super(vehicleNumber, 20);
 }

 // Charge calculation for Bike
 @Override
 public double calculateCharges(int hours) {

     double amount = baseRate * hours;

     // Penalty if parked more than 4 hours
     if (hours > 4) {
         amount += 50;
     }

     return amount;
 }
}
