package com.Java8ConversionLogicalQuestions.ObjectCollectionConversions;

import java.util.*;
import java.util.stream.*;

public class FlatContacts {
    public static void main(String[] args) {
        System.out.println(
            EmployeeData.getEmployees().stream()
                .flatMap(e -> e.getContacts().stream())
                .collect(Collectors.toList())
        );
    }
}
