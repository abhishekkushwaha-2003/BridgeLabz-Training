package com.Java8ConversionLogicalQuestions.ObjectCollectionConversions;

import java.util.*;

public class Employee {
    private int id;
    private String name;
    private String dept;
    private double salary;
    private List<String> contacts;

    public Employee(int id, String name, String dept, double salary, List<String> contacts) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        this.contacts = contacts;
    }

    public int getId() { 
    	return id; 
    	}
    public String getName() {
    	return name;
    	}
    public String getDept() { 
    	return dept;
    	}
    public double getSalary() { 
    	return salary; 
    	}
    public List<String> getContacts() { 
    	return contacts;
    	}

    public String toString() {
    	 return name + " | " + dept + " | " + salary;
    }
}
