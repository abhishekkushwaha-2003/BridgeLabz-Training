package com.Java8ConversionLogicalQuestions.ListToMap;

import java.util.*;
import java.util.stream.*;
public class ListofwordstoMap {

		    public static void main(String[] args) {
		    	 List<String> list = Arrays.asList("java",  "is", "java", "but", "java");

		         Map<String, Long> map =
		                 list.stream()
		                     .collect(Collectors.groupingBy(c->c, Collectors.counting()));
		                    
		         System.out.println(map);
		     }
		 }


