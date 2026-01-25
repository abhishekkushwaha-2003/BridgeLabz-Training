package com.AnnotationsAndReflection.AnnotationsProblem.BasicProblems.SuppressUncheckedWarnings;

import java.util.ArrayList;
import java.util.List;

public class SuppressUncheckedWarning {
    public static void main(String[] args) {

        @SuppressWarnings("unchecked")
        List list = new ArrayList();  // no generics

        list.add(10);
        list.add("Hello");

        System.out.println(list);
    }
}

