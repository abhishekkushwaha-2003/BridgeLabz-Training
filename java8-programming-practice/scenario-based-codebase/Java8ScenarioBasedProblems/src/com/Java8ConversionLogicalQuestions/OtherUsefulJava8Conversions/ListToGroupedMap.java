package com.Java8ConversionLogicalQuestions.OtherUsefulJava8Conversions;

import java.util.*;
import java.util.stream.*;

public class ListToGroupedMap {
    public static void main(String[] args) {
        System.out.println(
            List.of("A","B","A")
                .stream()
                .collect(Collectors.groupingBy(v -> v))
        );
    }
}
