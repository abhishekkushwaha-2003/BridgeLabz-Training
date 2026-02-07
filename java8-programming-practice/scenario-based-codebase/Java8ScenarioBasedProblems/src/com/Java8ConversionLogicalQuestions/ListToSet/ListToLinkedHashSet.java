package com.Java8ConversionLogicalQuestions.ListToSet;

import java.util.*;
import java.util.stream.*;

public class ListToLinkedHashSet {
    public static void main(String[] args) {

        List<String> list = List.of("Java", "SQL", "Java", "Spring");

        Set<String> set = list.stream()
                .collect(Collectors.toCollection(LinkedHashSet::new));

        System.out.println(set);
    }
}
