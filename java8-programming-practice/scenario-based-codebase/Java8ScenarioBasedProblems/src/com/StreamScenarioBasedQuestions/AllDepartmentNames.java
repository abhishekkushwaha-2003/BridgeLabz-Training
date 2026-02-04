package com.StreamScenarioBasedQuestions;

public class AllDepartmentNames {
    public static void main(String[] args) {
        EmployeeData.getEmployees().stream()
            .map(Employee::getDepartment)
            .distinct()
            .forEach(System.out::println);
    }
}
