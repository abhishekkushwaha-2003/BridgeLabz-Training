package com.day4.bubblesort.HospitalQueue;

//Represents a patient in the hospital
public class Patient {

 String name;
 int arrivalOrder;
 int criticality; // 1 (low) to 10 (high)

 public Patient(String name, int arrivalOrder, int criticality) {
     this.name = name;
     this.arrivalOrder = arrivalOrder;
     this.criticality = criticality;
 }

 public void display() {
     System.out.println(
         "Name: " + name +
         ", Arrival: " + arrivalOrder +
         ", Criticality: " + criticality
     );
 }
}
