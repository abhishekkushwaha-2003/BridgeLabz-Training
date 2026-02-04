package com.StreamScenarioBasedQuestions;

import java.util.*;

public class First5LowestPaidEmployee {
    public static void main(String[] args) {
        EmployeeData.getEmployees().stream()
            .sorted(Comparator.comparing(Employee::getSalary))
            .limit(5)
            .forEach(System.out::println);
    }
}
