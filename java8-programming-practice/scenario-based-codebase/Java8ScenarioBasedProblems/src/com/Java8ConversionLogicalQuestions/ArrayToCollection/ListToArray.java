package com.Java8ConversionLogicalQuestions.ArrayToCollection;

import java.util.*;

public class ListToArray {
    public static void main(String[] args) {

        List<String> list = List.of("A", "B", "C");

        String[] arr = list.toArray(new String[0]);

        System.out.println(Arrays.toString(arr));
    }
}
