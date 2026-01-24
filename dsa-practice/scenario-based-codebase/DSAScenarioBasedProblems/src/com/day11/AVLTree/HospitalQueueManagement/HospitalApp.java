package com.day11.AVLTree.HospitalQueueManagement;


public class HospitalApp {

 public static void main(String[] args) {

     HospitalAVL hospital = new HospitalAVL();

     // patient registration
     hospital.registerPatient(1, 930);
     hospital.registerPatient(2, 915);
     hospital.registerPatient(3, 1000);
     hospital.registerPatient(4, 945);

     System.out.println("Patients by Arrival Time:");
     hospital.displayPatients();

     // discharge a patient
     System.out.println("\nAfter discharging patient :");
     hospital.dischargePatient(945);
     hospital.displayPatients();
 }
}

