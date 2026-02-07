package com.Java8ConversionLogicalQuestions.ArrayToCollection;

import java.util.*;
import java.util.stream.*;

public class ArrayToMapValueKey {
    public static void main(String[] args) {

        String[] arr = {"Java", "SQL", "Spring"};

        Map<String, Integer> map =
                Arrays.stream(arr)
                      .collect(Collectors.toMap(
                          s -> s,
                          s -> s.length()
                      ));

        System.out.println(map);
    }
}

