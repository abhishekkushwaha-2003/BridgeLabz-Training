package com.StreamScenarioBasedQuestions;

import java.util.*;

public class YoungestMaleEmployeeInProductManagement {
    public static void main(String[] args) {
        System.out.println(
            EmployeeData.getEmployees().stream()
                .filter(e -> e.getGender().equals("Male"))
                .filter(e -> e.getDepartment().equals("Product Development"))
                .min(Comparator.comparing(Employee::getAge))
                .get()
        );
    }
}
