package com.StreamScenarioBasedQuestions;

public class EmployeeSalaryAbove25k{
    public static void main(String[] args) {
        EmployeeData.getEmployees().stream()
            .filter(e -> e.getSalary() > 25000)
            .forEach(System.out::println);
    }
}

