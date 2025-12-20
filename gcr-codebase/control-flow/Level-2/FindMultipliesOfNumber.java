// Creating a class FindMultipliesOfNumber to find the multiplies of a number

import java.util.Scanner;

public class FindMultipliesOfNumber {

    public static void main(String[] args) {
       		 Scanner sc = new Scanner(System.in);

    	       // Taking input from user and storing it in number variable

       		 System.out.print("Enter a number : ");
        	 int number = sc.nextInt();

		// checking condition for positive integer

        		 if (number > 0 && number < 100) {

			// for loop for traversing

            			for (int i = 100; i >= 1; i--) {

              		 	 if (i % number == 0) {

                  			  System.out.println(i);
               		 }

         	   }


        		}  else {

           		 		System.out.println("Number is not a positive Integer!");

       		 }

        		sc.close();
   	 }

}
