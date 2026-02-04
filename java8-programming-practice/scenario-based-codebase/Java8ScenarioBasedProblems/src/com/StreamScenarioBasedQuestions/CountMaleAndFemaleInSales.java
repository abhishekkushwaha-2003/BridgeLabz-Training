package com.StreamScenarioBasedQuestions;

import java.util.stream.*;

public class CountMaleAndFemaleInSales {
    public static void main(String[] args) {
        System.out.println(
            EmployeeData.getEmployees().stream()
                .filter(e -> e.getDepartment().equals("Sales"))
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()))
        );
    }
}

