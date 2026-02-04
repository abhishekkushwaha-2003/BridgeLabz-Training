package com.StreamScenarioBasedQuestions;

public class EmployeesJoinedAfter2015 {
    public static void main(String[] args) {
        EmployeeData.getEmployees().stream()
            .filter(e -> e.getYearOfJoining() > 2015)
            .map(Employee::getName)
            .forEach(System.out::println);
    }
}

