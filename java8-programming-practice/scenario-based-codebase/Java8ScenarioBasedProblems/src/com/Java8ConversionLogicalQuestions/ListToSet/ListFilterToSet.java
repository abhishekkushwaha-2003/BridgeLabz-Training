package com.Java8ConversionLogicalQuestions.ListToSet;

import java.util.*;
import java.util.stream.*;

public class ListFilterToSet {
    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2, 3, 4, 5, 6);

        Set<Integer> set = list.stream()
                               .filter(n -> n > 3)
                               .collect(Collectors.toSet());

        System.out.println(set);
    }
}

