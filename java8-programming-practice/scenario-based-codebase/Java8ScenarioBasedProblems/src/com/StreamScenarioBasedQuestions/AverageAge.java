package com.StreamScenarioBasedQuestions;

import java.util.stream.*;

public class AverageAge {
    public static void main(String[] args) {
        System.out.println(
            EmployeeData.getEmployees().stream()
                .collect(Collectors.groupingBy(Employee::getGender,
                        Collectors.averagingInt(Employee::getAge)))
        );
    }
}

