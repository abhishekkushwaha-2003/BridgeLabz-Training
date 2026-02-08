package com.Java8ConversionLogicalQuestions.ObjectCollectionConversions;

import java.util.*;
import java.util.stream.*;

public class NameSalaryMap {
    public static void main(String[] args) {
        System.out.println(
            EmployeeData.getEmployees().stream()
                .collect(Collectors.toMap(Employee::getName, Employee::getSalary))
        );
    }
}
