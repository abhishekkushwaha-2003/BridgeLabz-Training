package com.constructorandaccessmodifier.level1;

// EmployeeMain class
// this class contains the main method
public class EmployeeMain {

	    public static void main(String[] args) {

	        // creating Employee object
	        Employee e1 = new Employee(101, "IT", 40000);

	        System.out.println("Employee Details:");
	        e1.displayEmployee();

	        // modifying salary using public method
	        e1.setSalary(45000);

	        System.out.println("\nEmployee Details After Salary Update:");
	        e1.displayEmployee();

	        // creating Manager object
	        Manager m1 =
	                new Manager(201, "HR", 60000, "Team Lead");

	        System.out.println("\nManager Details:");
	        m1.displayManager();
	    }
	}

