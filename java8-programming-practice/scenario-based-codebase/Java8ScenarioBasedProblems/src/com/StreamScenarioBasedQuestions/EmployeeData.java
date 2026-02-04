package com.StreamScenarioBasedQuestions;

import java.util.*;

class EmployeeData {

    public static List<Employee> getEmployees() {
        return Arrays.asList(
            new Employee(1, "Abhishek", 25, "Male", "Sales", 2026, 45000),
            new Employee(2, "Rajeev", 30, "Male", "HR", 2014, 30000),
            new Employee(3, "Sonu", 28, "Male", "Product Development", 2023, 40000),
            new Employee(4, "Palak", 32, "Female", "Sales", 2024, 35000),
            new Employee(5, "Vikas", 26, "Male", "Product Development", 2023, 45000),
            new Employee(6, "Anita", 29, "Female", "Finance", 2026, 28000),
            new Employee(7, "Rashi", 35, "Female", "HR", 2015, 50000),
            new Employee(8, "Sneha", 24, "Female", "Product Development", 2022, 22000)
        );
    }
}

