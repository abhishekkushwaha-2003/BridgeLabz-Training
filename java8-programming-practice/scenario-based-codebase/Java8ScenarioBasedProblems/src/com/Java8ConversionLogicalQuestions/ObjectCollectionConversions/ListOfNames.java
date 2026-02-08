package com.Java8ConversionLogicalQuestions.ObjectCollectionConversions;

import java.util.*;
import java.util.stream.*;

public class ListOfNames {
    public static void main(String[] args) {
        System.out.println(
            EmployeeData.getEmployees().stream()
                .map(Employee::getName)
                .collect(Collectors.toList())
        );
    }
}

