package com.Java8LogicalQuestions;

import java.util.stream.Collectors;
import java.util.*;
public class FlattenList {
	
					   public static void main(String[] args) {
					List<List<Integer>>list=List.of(List.of(1,2), List.of(3, 4), List.of(5)); 
					List<Integer>newList =list.stream().flatMap(List::stream).collect(Collectors.toList());
						 System.out.println(newList);
					    }
			}
				