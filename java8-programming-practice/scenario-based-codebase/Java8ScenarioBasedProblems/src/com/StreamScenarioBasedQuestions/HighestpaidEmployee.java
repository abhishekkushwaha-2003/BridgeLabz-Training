package com.StreamScenarioBasedQuestions;
import java.util.*;

public class HighestpaidEmployee {
    public static void main(String[] args) {
        System.out.println(
            EmployeeData.getEmployees().stream()
                .max(Comparator.comparing(Employee::getSalary))
                .get()
        );
    }
}

