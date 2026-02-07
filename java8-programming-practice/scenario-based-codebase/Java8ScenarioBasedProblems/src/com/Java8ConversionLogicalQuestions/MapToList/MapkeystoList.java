package com.Java8ConversionLogicalQuestions.MapToList;

import java.util.*;
import java.util.stream.*;
public class MapkeystoList {

			 public static void main(String[] args) {
			 Map< String, Integer > map = Map.of("java", 1, "kava", 2, "language",  3);

			List< String> newlist =
			map.keySet().stream().collect(Collectors.toList());
					
			 System.out.println(newlist);
		
					     }
					 }

