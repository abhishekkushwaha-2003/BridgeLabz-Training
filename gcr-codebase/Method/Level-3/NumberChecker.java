//Create a class NumberChecker to display the results 

import java.util.Scanner;

public class NumberChecker{
	public static void main(String [] args){
	
		// Create a scanner class to take input from user 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		
		int number = sc.nextInt();
		
		int count = countDigits(number);
		
		int [] countArray = storeDigits(number, count);
		
		boolean duckNumber = checkDuckNumber(countArray);
		
		boolean armstrongNumber = checkArmstrong(number, countArray);
		
		int [] greaterAndSecondGreater = findLargestAndSecondLargestNumber(countArray);
		
		int [] smallestAndSecondSmallest = findSmallestAndSecondSmallestNumber(countArray);
		
		System.out.println("The count of digits in the number is : "+ count);
		
		//System.out.println("The digits of the number in a digits array is : "+ countArray);
		
		System.out.println("Duck number : "+duckNumber );
		
		System.out.println("Armstrong number : "+ armstrongNumber);
		
		System.out.println("The largest and second largest elements in the digits array are : "+ greaterAndSecondGreater[0]+" "+ greaterAndSecondGreater[1]);
		
		System.out.println("The smallest and second smallest elements in the digits array are : "+ smallestAndSecondSmallest[0]+" "+smallestAndSecondSmallest[1]);
		
	
	}
	
	// Method to Find the count of digits in the number

	
	 public static int countDigits(int number){
	 int count = 0;
	 while(number > 0){
		number /= 10;
		count ++;
	 }
	 return count;
	 
	 }
	 
	 
	 // Method to Store the digits of the number in a digits array
	 
	 
	 public static int [] storeDigits(int number, int count){
		 
		 int [] arr = new int [count];
		 int index = 0;
		 
		 for(int i=0; i<arr.length; i++){
			 arr[index++] = number % 10; 
			 number /= 10;
			 
		 }
		 return arr;
	 
	 }
	 
	 // Method to Check if a number is a duck number using the digits array
	 
	 public static boolean checkDuckNumber(int []countArray){
		 
		 boolean check = true;
		 
		 for(int i=0; i<countArray.length; i++){
			 if(countArray[i] == 0){
				check = false;
				 
			 } 
			 
		 }
		 
		  return check; 
		 
	 }
	 
	 // Method to check the number is a armstrong number using the digits array
	 
	 public static boolean checkArmstrong(int number, int [] countArray){
		 
		 int sum = 0;
		 for(int i=0; i<countArray.length; i++ ){
			 
			 sum += (countArray[i] * countArray[i] * countArray[i]);
			 
		 }
		 
		 return number == sum;
		 
	 }
	 
	 // Method to find the largest and second largest elements in the digits array
	 
	 public static int [] findLargestAndSecondLargestNumber(int [] countArray){
		 int largest = Integer.MIN_VALUE;
		  int secondLargest = Integer.MIN_VALUE;
		 for(int i=0; i<countArray.length; i++){
			 if(countArray[i] > largest){
				 secondLargest = largest;
				 largest = countArray[i];
				
			 } else if(countArray[i] > secondLargest && countArray[i] != largest){
				 secondLargest = countArray[i];
				 
			 }
			 
		 }
		 
		 int result [] = new int[2];
		 result[0] = largest;
		 result[1] = secondLargest;
		 
		 return result;
		 
		 
	 }
	 
	 // Method to find the the smallest and second smallest elements in the digits array
	 
	 public static int [] findSmallestAndSecondSmallestNumber(int [] countArray){
		 
		 int smallest = Integer.MAX_VALUE;
		  int secondSmallest = Integer.MAX_VALUE;
		 for(int i=0; i<countArray.length; i++){
			 if(countArray[i] < smallest){
				  secondSmallest = smallest;
				 smallest = countArray[i];
				 
			 } else if(countArray[i] < secondSmallest && countArray[i] != smallest){
				 secondSmallest = countArray[i];
				 
			 }
			 
		 }
		 
		 int result [] = new int[2];
		 result[0] = smallest;
		 result[1] = secondSmallest;
		 
		 return result;
		 
		 
	 }

}