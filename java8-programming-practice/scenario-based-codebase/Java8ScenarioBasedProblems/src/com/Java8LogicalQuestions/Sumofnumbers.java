package com.Java8LogicalQuestions;

import java.util.List;
import java.util.Scanner;
import java.util.stream.*;

public class Sumofnumbers {

			public static void main(String[] args) {
			   List<Integer>list=List.of(1, 2, 3, 4, 5);
		long sum= list.stream().reduce(0, (a, b)-> a+b);
		System.out.println(sum);
			}
		}