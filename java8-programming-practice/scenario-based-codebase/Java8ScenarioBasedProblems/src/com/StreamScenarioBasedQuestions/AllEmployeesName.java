package com.StreamScenarioBasedQuestions;

import java.util.stream.*;

public class AllEmployeesName {
    public static void main(String[] args) {
        System.out.println(
            EmployeeData.getEmployees().stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.mapping(Employee::getName, Collectors.toList())))
        );
    }
}
