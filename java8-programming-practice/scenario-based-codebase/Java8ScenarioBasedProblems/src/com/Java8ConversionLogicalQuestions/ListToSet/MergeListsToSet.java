package com.Java8ConversionLogicalQuestions.ListToSet;

import java.util.*;
import java.util.stream.*;

public class MergeListsToSet {
    public static void main(String[] args) {

        List<Integer> list1 = List.of(1, 2, 3);
        List<Integer> list2 = List.of(3, 4, 5);

        Set<Integer> set = Stream.concat(list1.stream(), list2.stream())
                                 .collect(Collectors.toSet());

        System.out.println(set);
    }
}
