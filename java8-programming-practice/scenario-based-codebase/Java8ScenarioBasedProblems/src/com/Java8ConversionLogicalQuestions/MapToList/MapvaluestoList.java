package com.Java8ConversionLogicalQuestions.MapToList;

import java.util.*;
import java.util.stream.*;
public class MapvaluestoList {

				 public static void main(String[] args) {
				 Map< String, Integer > map = Map.of("java", 1, "kava", 2, "language",  3);

				List< Integer> newlist =
				map.values().stream().collect(Collectors.toList());
										
				 System.out.println(newlist);
			
						     }
						 }


