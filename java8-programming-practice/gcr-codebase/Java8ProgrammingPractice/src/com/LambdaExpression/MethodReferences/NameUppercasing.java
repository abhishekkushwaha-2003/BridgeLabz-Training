package com.LambdaExpression.MethodReferences;

import java.util.*;
import java.util.stream.Collectors;

public class NameUppercasing {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("abhishek", "sonu", "rajeev");

        List<String> upperNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(upperNames);
    }
}
