package com.Java8ConversionLogicalQuestions.OtherUsefulJava8Conversions;

import java.util.*;
import java.util.stream.*;

public class GroupedMapToList {
    public static void main(String[] args) {
        Map<String,List<String>> map = Map.of("A",List.of("A","A"));
        System.out.println(
            map.values().stream()
                .flatMap(List::stream)
                .collect(Collectors.toList())
        );
    }
}
