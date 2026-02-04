package com.StreamScenarioBasedQuestions;

import java.util.*;

public class ThirdHighestPaidSalary {
    public static void main(String[] args) {
        Employee thirdHighest =
            EmployeeData.getEmployees().stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .skip(2)
                .findFirst()
                .get();

        System.out.println(thirdHighest);
    }
}
