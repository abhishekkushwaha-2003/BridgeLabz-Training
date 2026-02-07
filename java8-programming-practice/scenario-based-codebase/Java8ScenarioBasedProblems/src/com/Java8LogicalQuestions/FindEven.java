package com.Java8LogicalQuestions;

import java.util.List;
import java.util.Scanner;
import java.util.stream.*;

public class FindEven {

	public static void main(String[] args) {
	   List<Integer>list=List.of(2, 5, 7, 8, 10, 13);
  List<Integer>evenNum= list.stream().filter(x->x%2==0).toList();
  System.out.println(evenNum);
	}
}
