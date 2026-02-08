package com.Java8ConversionLogicalQuestions.ObjectCollectionConversions;

import java.util.*;

public class EmployeeData {
    public static List<Employee> getEmployees() {
        return Arrays.asList(
            new Employee(1,"Abhishek","IT",50000,Arrays.asList("1147589681","2784259622")),
            new Employee(2,"Riya","HR",40000,Arrays.asList("3314523693")),
            new Employee(3,"Suresh","IT",60000,Arrays.asList("4425963544","5545789655"))
        );
    }
}
