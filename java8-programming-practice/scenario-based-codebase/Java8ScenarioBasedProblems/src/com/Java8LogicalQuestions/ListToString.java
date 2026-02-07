package com.Java8LogicalQuestions;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class ListToString {

				    public static void main(String[] args) {
				    	   List<Integer>list=List.of(1,2,3);
					List<String>newList= list.stream().map(c->c+"")
							.collect(Collectors.toList());
					System.out.println(newList);
				    }

				}