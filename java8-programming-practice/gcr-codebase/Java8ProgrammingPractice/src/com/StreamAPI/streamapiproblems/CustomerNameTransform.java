package com.StreamAPI.streamapiproblems;

import java.util.*;
import java.util.stream.Collectors;

public class CustomerNameTransform {
    public static void main(String[] args) {

        List<String> names =
                Arrays.asList("rajeev", "abhi", "sonu", "karan");

        names.stream()
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
    }
}
