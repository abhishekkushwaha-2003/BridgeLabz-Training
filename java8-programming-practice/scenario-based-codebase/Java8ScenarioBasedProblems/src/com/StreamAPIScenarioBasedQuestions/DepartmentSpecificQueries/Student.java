package com.StreamAPIScenarioBasedQuestions.DepartmentSpecificQueries;
import java.util.*;

public class Student {
    private int id;
    private String name;
    private int age;
    private String gender;
    private String city;
    private String state;
    private String department;
    private int rank;
    private List<String> contacts;

    public Student(int id, String name, int age, String gender,
                   String city, String state, String department, int rank, List<String> contacts) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.city = city;
        this.state = state;
        this.department = department;
        this.rank = rank;
        this.contacts = contacts;
    }

    public int getId() {
    	return id; 
    }
    public String getName() { 
    	return name; 
    }
    public int getAge() { 
    	return age; 
    }
    public String getGender() {
    	return gender; 
    }
    public String getCity() {
    	return city;
    }
    public String getState() {
    	return state;
    }
    public String getDepartment() { 
    	return department;
    }
    public int getRank() { 
    	return rank; 
    }
    public List<String> getContacts() { 
    	return contacts; 
    }

    public String toString() {
    	return id + " | " + name + " | " + age + " | " +
                gender + " | " + city + " | " + state + " | " + rank + " | " + department;
    }
}
