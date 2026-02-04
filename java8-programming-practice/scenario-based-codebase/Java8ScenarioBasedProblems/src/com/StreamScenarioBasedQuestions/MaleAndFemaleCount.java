package com.StreamScenarioBasedQuestions;

import java.util.*;
import java.util.stream.*;

public class MaleAndFemaleCount {
    public static void main(String[] args) {
        List<Employee> list = EmployeeData.getEmployees();

        System.out.println(
            list.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()))
        );
    }
}

