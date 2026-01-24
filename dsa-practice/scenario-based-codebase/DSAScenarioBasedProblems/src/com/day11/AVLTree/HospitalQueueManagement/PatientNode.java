package com.day11.AVLTree.HospitalQueueManagement;

// create a  class to represents one patient record

public class PatientNode {

 int patientId;       
 int checkInTime;      
 int height;           

 PatientNode left;
 PatientNode right;

 // constructor
 public PatientNode(int patientId, int checkInTime) {
     this.patientId = patientId;
     this.checkInTime = checkInTime;
     this.height = 1;  
 }
}
