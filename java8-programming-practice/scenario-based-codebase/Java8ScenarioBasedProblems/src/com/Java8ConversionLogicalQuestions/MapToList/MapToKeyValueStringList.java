package com.Java8ConversionLogicalQuestions.MapToList;
import java.util.*;

public class MapToKeyValueStringList {
    public static void main(String[] args) {

        Map<Integer, String> map = Map.of(
                1, "Java",
                2, "Spring",
                3, "SQL"
        );

        List<String> list = map.entrySet()
                .stream()
                .map(e -> e.getKey() + "=" + e.getValue())
                .toList();

        System.out.println(list);
    }
}
