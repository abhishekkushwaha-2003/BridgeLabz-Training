package com.constructorandaccessmodifier.level1;

//Employee class
//this class demonstrates access modifiers

public class Employee {

 // public variable - accessible everywhere
 public int employeeID;

 // protected variable - accessible in same package and subclasses
 protected String department;

 // private variable - accessible only inside this class
 private double salary;

 // constructor to initialize employee details
 Employee(int employeeID, String department, double salary) {
     this.employeeID = employeeID;
     this.department = department;
     this.salary = salary;
 }

 // public method to update salary
 // used to modify private variable
 public void setSalary(double salary) {
     this.salary = salary;
 }

 // public method to get salary
 public double getSalary() {
     return salary;
 }

 // method to display employee details
 void displayEmployee() {
     System.out.println("Employee ID : " + employeeID);
     System.out.println("Department  : " + department);
     System.out.println("Salary      : Rs. " + salary);
 }
}
