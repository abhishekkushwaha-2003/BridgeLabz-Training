package com.JavaStreams.Serialization;

import java.io.*;
import java.util.ArrayList;

// Main class
public class EmployeeSerializationApp {

    public static void main(String[] args) {

        String fileName = "employees.dat";

        // Create employee list
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Aman", "IT", 50000));
        employees.add(new Employee(102, "Riya", "HR", 45000));
        employees.add(new Employee(103, "Kunal", "Finance", 60000));

        // ---------- SERIALIZATION ----------
        try {
            ObjectOutputStream oos =
                    new ObjectOutputStream(new FileOutputStream(fileName));

            oos.writeObject(employees);
            oos.close();

            System.out.println("Employees saved successfully.");

        } catch (IOException e) {
            System.out.println("Error during serialization.");
        }

        // ---------- DESERIALIZATION ----------
        try {
            ObjectInputStream ois =
                    new ObjectInputStream(new FileInputStream(fileName));

            ArrayList<Employee> storedEmployees =
                    (ArrayList<Employee>) ois.readObject();

            ois.close();

            System.out.println("\nEmployees retrieved from file:");
            for (Employee e : storedEmployees) {
                e.display();
            }

        } catch (IOException e) {
            System.out.println("Error during deserialization.");
        } catch (ClassNotFoundException e) {
            System.out.println("Employee class not found.");
        }
    }
}
