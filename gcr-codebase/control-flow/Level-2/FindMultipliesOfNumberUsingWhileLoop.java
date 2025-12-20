// Creating a class FindMultipliesOfNumberUsingWhileLoop to find the multiplies of a number

import java.util.Scanner;

public class FindMultipliesOfNumberUsingWhileLoop {

    public static void main(String[] args) {
       		 Scanner sc = new Scanner(System.in);

    	       // Taking input from user and storing it in number variable

       		 System.out.print("Enter a number : ");
        	 int number = sc.nextInt();

		        // checking condition for positive integer

        		 if (number > 0 && number < 100) {
					 
					 int counter = 100;

			      // for loop for traversing

            			while(counter > 1) {

              		 	 if (counter % number == 0) {

                  			  System.out.println(counter);
							  
							 
               		 }
					 
					 counter --; 

         	   }


        		}  else {

           		 		System.out.println("Number is not a positive Integer!");

       		 }

        		sc.close();
   	 }

}
