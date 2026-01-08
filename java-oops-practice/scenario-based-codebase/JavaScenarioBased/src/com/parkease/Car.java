package com.parkease;

//Car class extending Vehicle
public class Car extends Vehicle {

 // Constructor for Car
 public Car(String vehicleNumber) {
     super(vehicleNumber, 50);
 }

 // Charge calculation for Car
 @Override
 public double calculateCharges(int hours) {

     // Base charge calculation
     double amount = baseRate * hours;

     // Penalty if parked more than 5 hours
     if (hours > 5) {
         amount += 100;
     }

     return amount;
 }
}
