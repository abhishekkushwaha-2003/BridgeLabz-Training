package com.Java8ConversionLogicalQuestions.OtherUsefulJava8Conversions;

import java.util.*;
import java.util.stream.*;

public class PartitionToLists {
    public static void main(String[] args) {
        Map<Boolean,List<Integer>> map =
            List.of(1,2,3,4).stream()
                .collect(Collectors.partitioningBy(i -> i % 2 == 0));

        System.out.println(map.get(true));
        System.out.println(map.get(false));
    }
}
