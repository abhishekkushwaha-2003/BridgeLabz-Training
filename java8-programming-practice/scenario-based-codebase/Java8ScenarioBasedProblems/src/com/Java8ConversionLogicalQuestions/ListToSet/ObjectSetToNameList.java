package com.Java8ConversionLogicalQuestions.ListToSet;

import java.util.*;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class ObjectSetToNameList {
    public static void main(String[] args) {

        Set<Student> set = Set.of(
                new Student(1, "Rohit"),
                new Student(2, "Amit")
        );

        List<String> names = set.stream()
                                .map(s -> s.name)
                                .toList();

        System.out.println(names);
    }
}
