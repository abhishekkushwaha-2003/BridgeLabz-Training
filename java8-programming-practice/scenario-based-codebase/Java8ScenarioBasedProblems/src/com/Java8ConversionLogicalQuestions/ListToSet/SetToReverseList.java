package com.Java8ConversionLogicalQuestions.ListToSet;

import java.util.*;

public class SetToReverseList {
    public static void main(String[] args) {

        Set<Integer> set = Set.of(1, 2, 3, 4);

        List<Integer> list = set.stream()
                                .sorted(Comparator.reverseOrder())
                                .toList();

        System.out.println(list);
    }
}
