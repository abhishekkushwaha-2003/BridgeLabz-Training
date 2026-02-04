package com.StreamScenarioBasedQuestions;

import java.util.*;

public class SecongHighestPaidEmployee {
    public static void main(String[] args) {
        Employee secondHighest =
            EmployeeData.getEmployees().stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .skip(1)
                .findFirst()
                .get();

        System.out.println(secondHighest);
    }
}
