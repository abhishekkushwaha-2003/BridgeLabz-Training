package com.Java8ConversionLogicalQuestions.ArrayToCollection;

import java.util.*;
import java.util.stream.*;

public class ArrayToSet {
    public static void main(String[] args) {

        String[] arr = {"Java", "SQL", "Java"};

        Set<String> set = Arrays.stream(arr)
                                .collect(Collectors.toSet());

        System.out.println(set);
    }
}
