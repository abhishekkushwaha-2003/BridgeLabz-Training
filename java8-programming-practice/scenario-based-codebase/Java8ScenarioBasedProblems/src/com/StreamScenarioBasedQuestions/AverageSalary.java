package com.StreamScenarioBasedQuestions;

import java.util.stream.*;

public class AverageSalary {
    public static void main(String[] args) {
        System.out.println(
            EmployeeData.getEmployees().stream()
                .collect(Collectors.groupingBy(Employee::getGender,
                        Collectors.averagingDouble(Employee::getSalary)))
        );
    }
}
