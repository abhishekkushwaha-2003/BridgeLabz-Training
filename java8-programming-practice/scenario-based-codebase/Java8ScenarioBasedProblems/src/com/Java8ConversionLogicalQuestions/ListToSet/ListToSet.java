package com.Java8ConversionLogicalQuestions.ListToSet;

import java.util.*;
import java.util.stream.*;

public class ListToSet {
    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2, 2, 3, 4, 4);

        Set<Integer> set = list.stream()
                               .collect(Collectors.toSet());

        System.out.println(set);
    }
}
