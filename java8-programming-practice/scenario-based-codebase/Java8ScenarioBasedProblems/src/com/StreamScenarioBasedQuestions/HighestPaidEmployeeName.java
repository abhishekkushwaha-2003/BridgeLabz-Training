package com.StreamScenarioBasedQuestions;

import java.util.*;

public class HighestPaidEmployeeName {
    public static void main(String[] args) {
        Employee highest =
            EmployeeData.getEmployees().stream()
                .max(Comparator.comparing(Employee::getSalary))
                .get();

        System.out.println(highest);
    }
}
