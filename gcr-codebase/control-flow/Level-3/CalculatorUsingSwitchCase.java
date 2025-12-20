// Write a program to create a calculator using switch case

// create a class CalculatorUsingSwitchCase to make calculator

import java.util.Scanner;

public class CalculatorUsingSwitchCase {
    public static void main(String[] args) {
	
	// create a scanner object to take input from user

        Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter first number: ");
        double first = sc.nextDouble();

        System.out.print("Enter second number: ");
        double second = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        String op = sc.next();

        //  for Loop
        int number = 2;
        for (int i = 1; i < number; i++) {
			
			// using switch case 

            switch (op) {
				
				// addition operation is performed
				
                case "+":
                    System.out.println("Result = " + (first + second));
                    break;
					
					// subtraction operation is performed

                case "-":
                    System.out.println("Result = " + (first - second));
                    break;
					
					// multiplication operation is performed

                case "*":
                    System.out.println("Result = " + (first * second));
                    break;
					
					// division operation is performed

                case "/":
                     System.out.println("Result = " + (first / second));
                    break;
					
					// if another operator entered then this default case will execute
					
                default:
                    System.out.println("Invalid Operator");
            }
        }

        sc.close();
    }
}
