package com.Java8LogicalQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StringLength {

			public static void main(String[] args) {
			   List<String>list=List.of("cat","elephant","dog");
		List<Integer>countWordslen= list.stream().map(String::length).collect(Collectors.toList());
		  System.out.println(countWordslen);
			}
		}
