package com.Java8LogicalQuestions;

import java.util.stream.Collectors;
import java.util.*;
public class KthSmallestNumber {

					   public static void main(String[] args) {
					List<Integer>list=List.of(9,1,5,3,7);
                      int k=3;
						Integer kth=list.stream().sorted().skip(k).findFirst().orElse(null);
						 System.out.println(kth);
					    }
			}
				