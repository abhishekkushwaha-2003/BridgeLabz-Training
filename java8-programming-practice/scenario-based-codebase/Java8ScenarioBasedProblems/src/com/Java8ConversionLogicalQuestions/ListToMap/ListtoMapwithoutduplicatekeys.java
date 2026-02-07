package com.Java8ConversionLogicalQuestions.ListToMap;

import java.util.*;
import java.util.stream.*;
public class ListtoMapwithoutduplicatekeys {

		 public static void main(String[] args) {
		 List<String> list = Arrays.asList("java", "java", "a", "programming", "language");

		 Map< String, Integer> map =
		 list.stream().distinct()
		 .collect(Collectors.toMap(c->c, c->c.length()));
				                    
		 System.out.println(map);
				     }
				 }


