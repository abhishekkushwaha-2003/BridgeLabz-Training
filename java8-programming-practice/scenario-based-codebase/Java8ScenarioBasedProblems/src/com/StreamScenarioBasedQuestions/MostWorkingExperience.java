package com.StreamScenarioBasedQuestions;

import java.util.*;

public class MostWorkingExperience {
    public static void main(String[] args) {
        System.out.println(
            EmployeeData.getEmployees().stream()
                .min(Comparator.comparing(Employee::getYearOfJoining))
                .get()
        );
    }
}
