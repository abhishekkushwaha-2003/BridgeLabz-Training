//Create a program to divide N number of chocolates among M children. Print the number of chocolates each child will get and also the remaining chocolates


import java.util.Scanner;

// Create a class ChocolatesDistribution to distribute the chocolate among children

public class ChocolatesDistribution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter total number of chocolates : ");
        int numberOfChocolates = sc.nextInt();

        System.out.print("Enter number of children: ");
        int numberOfChildren = sc.nextInt();

        // Method Calling 
        int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

        // Display result
        System.out.println("Each child gets : " + result[0] + " chocolates \nAnd the Remaining chocolates are : "+ result[1]);

        sc.close();
    }

    // Method to find quotient and remainder
    public static int[] findRemainderAndQuotient(int number, int divisor) {

        int quotient = number / divisor;   
        int remainder = number % divisor;  

        return new int[]{quotient, remainder};
    }
}
