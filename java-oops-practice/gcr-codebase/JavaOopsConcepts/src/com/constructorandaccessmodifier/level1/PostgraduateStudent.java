package com.constructorandaccessmodifier.level1;

//PostgraduateStudent class
//this class extends Student to show use of protected members

class PostgraduateStudent extends Student {

 String specialization;

 // constructor
 PostgraduateStudent(int rollNumber, String name, double cgpa, String specialization) {
     super(rollNumber, name, cgpa);
     this.specialization = specialization;
 }

 // method to display postgraduate student details
 void displayPGStudent() {

     // accessing protected variable 'name' from parent class
     System.out.println("Roll Number     : " + rollNumber);
     System.out.println("Name            : " + name);
     System.out.println("Specialization  : " + specialization);
     System.out.println("CGPA            : " + getCGPA());
 }
}

