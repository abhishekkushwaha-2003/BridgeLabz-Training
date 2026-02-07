package com.Java8ConversionLogicalQuestions.ListToSet;
import java.util.*;

public class SetToList {
    public static void main(String[] args) {

        Set<String> set = Set.of("Java", "Spring", "SQL");

        List<String> list = set.stream()
                               .toList();

        System.out.println(list);
    }
}
