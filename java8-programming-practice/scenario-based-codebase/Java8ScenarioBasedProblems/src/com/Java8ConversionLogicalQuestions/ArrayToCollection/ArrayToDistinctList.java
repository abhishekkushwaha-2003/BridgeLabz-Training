package com.Java8ConversionLogicalQuestions.ArrayToCollection;

import java.util.*;
import java.util.stream.*;

public class ArrayToDistinctList {
    public static void main(String[] args) {

        Integer[] arr = {1, 2, 2, 3, 3, 4};

        List<Integer> list = Arrays.stream(arr)
                                   .distinct()
                                   .toList();

        System.out.println(list);
    }
}
