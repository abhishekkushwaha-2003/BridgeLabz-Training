package com.Java8ConversionLogicalQuestions.MapToList;

import java.util.*;
import java.util.stream.*;
public class MapentriestoList {

				 public static void main(String[] args) {
				 Map< String, Integer > map = Map.of("java", 1, "kava", 2, "language",  3);

				List< Map.Entry<String, Integer>> newlist =
				map.entrySet().stream().collect(Collectors.toList());
						
			newlist.forEach(e->{ System.out.print(e.getKey()+ " = "+ e.getValue());});
						     }
						 }


