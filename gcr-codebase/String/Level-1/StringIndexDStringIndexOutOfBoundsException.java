//Write a program to demonstrate StringIndexOutOfBoundsException


import java.util.Scanner;

public class StringIndexDStringIndexOutOfBoundsException {

    public static void main(String[] args) {

        // Scanner for input
        Scanner sc = new Scanner(System.in);

        // Taking string input
        System.out.print("Enter text : ");
        String text = sc.next();

        // handle exception method
        handleException(text);
    }

    // Method to handle StringIndexOutOfBoundsException
	
    public static void handleException(String text) {

        try {
            // Accessing index greater than length
            text.charAt(text.length());
			
        } catch (StringIndexOutOfBoundsException e) {
            // Handling exception
            System.out.println("StringIndexOutOfBoundsException handled");
        }
    }
}
