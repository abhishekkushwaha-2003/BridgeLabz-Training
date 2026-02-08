package com.Java8ConversionLogicalQuestions.ObjectCollectionConversions;

import java.util.*;
import java.util.stream.*;

public class CompositeKeyMap {
    public static void main(String[] args) {
        System.out.println(
            EmployeeData.getEmployees().stream()
                .collect(Collectors.toMap(
                    e -> e.getDept() + "_" + e.getName(),
                    e -> e
                ))
        );
    }
}
