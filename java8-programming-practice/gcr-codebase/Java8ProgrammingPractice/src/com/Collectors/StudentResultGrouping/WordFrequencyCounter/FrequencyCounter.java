package com.Collectors.StudentResultGrouping.WordFrequencyCounter;

import java.util.*;
import java.util.stream.Collectors;

public class FrequencyCounter{
    public static void main(String[] args) {

        String text = "java is fun and java is powerful";

        Map<String, Integer> wordCount =
            Arrays.stream(text.split(" "))
                .collect(Collectors.toMap(
                    word -> word,
                    word -> 1,
                    Integer::sum
                ));

        System.out.println(wordCount);
    }
}
