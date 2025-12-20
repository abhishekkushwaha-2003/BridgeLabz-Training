// Creating a class 

import java.util.Scanner;

public class PowerOfNumber {

    	public static void main(String[] args) {

		   // Using scanner object to take user input for number and power	
	
    		    Scanner sc = new Scanner(System.in);

     		   System.out.print("Enter number : ");

		  // Assigning values

     		   int number = sc.nextInt();

     		   System.out.print("Enter power : ");

     		   int power = sc.nextInt();

       			 if (number > 0 && power > 0) {
        		    int result = 1;

         		    for (int i = 1; i <= power; i++) {

           		     result = result * number;
     	       }

          		  System.out.println("Result : " + result);

      		  } else {

           		 System.out.println("Number is not a positive integer!");
        	}

	    	    sc.close();

  	  }

}
