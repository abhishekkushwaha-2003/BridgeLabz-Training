package com.Java8ConversionLogicalQuestions.MapToList;

import java.util.*;

public class MapSortByValue {
    public static void main(String[] args) {

        Map<Integer,String> map = Map.of(
                1,"SQL",
                2,"Java",
                3,"Docker"
        );

        List<Map.Entry<Integer,String>> list =
                map.entrySet()
                   .stream()
                   .sorted(Map.Entry.comparingByValue())
                   .toList();

        list.forEach(System.out::println);
    }
}
