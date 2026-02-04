package com.StreamScenarioBasedQuestions;

import java.util.*;

public class LowestPaidEmployee {
    public static void main(String[] args) {
        Employee lowest =
            EmployeeData.getEmployees().stream()
                .min(Comparator.comparing(Employee::getSalary))
                .get();

        System.out.println(lowest);
    }
}
