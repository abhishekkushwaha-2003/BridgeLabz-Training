package com.Java8ConversionLogicalQuestions.MapToList;

import java.util.*;

public class MapFilterGreaterThanN {
    public static void main(String[] args) {

        Map<String,Integer> map = Map.of(
                "A",10,
                "B",25,
                "C",5
        );

        int N = 10;

        List<Map.Entry<String,Integer>> list =
                map.entrySet()
                   .stream()
                   .filter(e -> e.getValue() > N)
                   .toList();

        list.forEach(System.out::println);
    }
}
