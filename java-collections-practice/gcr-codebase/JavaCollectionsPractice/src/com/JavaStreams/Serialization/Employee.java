package com.JavaStreams.Serialization;

import java.io.Serializable;

//Employee class must implement Serializable
public class Employee implements Serializable {

 // Recommended for Serializable classes
 private static final long serialVersionUID = 1L;

 private int id;
 private String name;
 private String department;
 private double salary;

 // Constructor
 public Employee(int id, String name, String department, double salary) {
     this.id = id;
     this.name = name;
     this.department = department;
     this.salary = salary;
 }

 // Display employee details
 public void display() {
     System.out.println(
         "ID: " + id +
         ", Name: " + name +
         ", Dept: " + department +
         ", Salary: " + salary
     );
 }
}
