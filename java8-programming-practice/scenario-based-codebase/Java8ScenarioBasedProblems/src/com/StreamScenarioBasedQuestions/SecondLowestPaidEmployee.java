package com.StreamScenarioBasedQuestions;

import java.util.*;

public class SecondLowestPaidEmployee {
    public static void main(String[] args) {
        Employee secondLowest =
            EmployeeData.getEmployees().stream()
                .sorted(Comparator.comparing(Employee::getSalary))
                .skip(1)
                .findFirst()
                .get();

        System.out.println(secondLowest);
    }
}
