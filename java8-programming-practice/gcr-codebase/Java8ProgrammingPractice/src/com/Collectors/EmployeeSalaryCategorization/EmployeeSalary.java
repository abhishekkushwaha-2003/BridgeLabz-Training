package com.Collectors.EmployeeSalaryCategorization;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeSalary {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
            new Employee("Amit", "IT", 60000),
            new Employee("Neha", "IT", 70000),
            new Employee("Ravi", "HR", 45000),
            new Employee("Suman", "HR", 51000)
        );

        Map<String, Double> avgSalaryByDept =
            employees.stream()
                .collect(Collectors.groupingBy(
                    Employee::getDepartment,
                    Collectors.averagingDouble(Employee::getSalary)
                ));

        System.out.println(avgSalaryByDept);
    }
}

