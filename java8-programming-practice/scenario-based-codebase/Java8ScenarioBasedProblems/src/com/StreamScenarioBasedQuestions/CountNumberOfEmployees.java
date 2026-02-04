package com.StreamScenarioBasedQuestions;

import java.util.stream.*;

public class CountNumberOfEmployees {
    public static void main(String[] args) {
        System.out.println(
            EmployeeData.getEmployees().stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()))
        );
    }
}
