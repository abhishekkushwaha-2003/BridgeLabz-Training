package com.StreamScenarioBasedQuestions;

import java.util.stream.*;

public class AverageSalaryOfDepartment {
    public static void main(String[] args) {
        System.out.println(
            EmployeeData.getEmployees().stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)))
        );
    }
}
