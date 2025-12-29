package com.constructorandaccessmodifier.level1;

//Manager class
//this class extends Employee to show protected access

class Manager extends Employee {

 String designation;

 // constructor
 Manager(int employeeID, String department,
         double salary, String designation) {

     super(employeeID, department, salary);
     this.designation = designation;
 }

 // method to display manager details
 void displayManager() {

     // accessing public and protected members from parent class
     System.out.println("Employee ID  : " + employeeID);
     System.out.println("Department   : " + department);
     System.out.println("Designation  : " + designation);
     System.out.println("Salary       : Rs. " + getSalary());
 }
}

