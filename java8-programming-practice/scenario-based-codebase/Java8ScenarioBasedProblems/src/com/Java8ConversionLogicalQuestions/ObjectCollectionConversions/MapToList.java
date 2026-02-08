package com.Java8ConversionLogicalQuestions.ObjectCollectionConversions;

import java.util.*;
import java.util.stream.*;

public class MapToList {
    public static void main(String[] args) {
        Map<Integer, Employee> map =
            EmployeeData.getEmployees().stream()
                .collect(Collectors.toMap(Employee::getId, e -> e));

        System.out.println(
            map.values().stream()
                .map(Employee::getName)
                .collect(Collectors.toList())
        );
    }
}
