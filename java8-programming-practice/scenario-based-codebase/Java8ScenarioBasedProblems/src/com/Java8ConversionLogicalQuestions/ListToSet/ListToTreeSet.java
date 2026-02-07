package com.Java8ConversionLogicalQuestions.ListToSet;

import java.util.*;
import java.util.stream.*;

public class ListToTreeSet {
    public static void main(String[] args) {

        List<Integer> list = List.of(5, 1, 3, 2, 4);

        Set<Integer> set = list.stream()
                .collect(Collectors.toCollection(TreeSet::new));

        System.out.println(set);
    }
}
