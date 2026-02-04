package com.StreamScenarioBasedQuestions;

import java.util.*;

public class First5HighestPaidEmployee {
    public static void main(String[] args) {
        EmployeeData.getEmployees().stream()
            .sorted(Comparator.comparing(Employee::getSalary).reversed())
            .limit(5)
            .forEach(System.out::println);
    }
}
