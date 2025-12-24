// Write a Java program that takes height and weight as input.
// calculates BMI using the formula BMI = weight / (height * height), and prints the BMI category as Underweight, Normal, or Overweight using if-else conditions.
// Use meaningful variable names and proper comments to maintain clean code.

import java.util.Scanner;
public class BMIFitnessTracker{
	public static void main(String [] args){
	
	// Create a Scanner object to take input from user
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter Your Height in cm : ");
	
	// taking height as input
	double height = sc.nextDouble();
	
	System.out.print("Enter Your Weight : ");
	
	// taking weight as input
	double weight = sc.nextDouble();
	
	// Calulation of BMI
	double heightInMeter = height/100;
	double bmiCalculate = weight / (heightInMeter * heightInMeter);
	
	// Checking condtion according to weight by using if else 
	
	if(bmiCalculate < 18.5){
	System.out.print("Your BMI is : " + bmiCalculate + " And you are Underweight");
	
	} else 	if(bmiCalculate < 25){
	System.out.print("Your BMI is : " + bmiCalculate + " And you are Normal");
	
	}else{
	System.out.print("Your BMI is : " + bmiCalculate + " And you are Overweight");
	} 
	
	// closing Scanner class
	
	sc.close(); 
	
	}
}