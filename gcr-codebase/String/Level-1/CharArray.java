import java.util.Scanner;

public class CharArray {
    public static void main(String[] args) {

        // Scanner object to takeinput 
        Scanner sc = new Scanner(System.in);

        // Taking string input
		
        System.out.print("Enter text : ");
        String text = sc.next();

        // Getting characters using user-defined method
		
        char[] arr1 = getChars(text);

        // Getting characters using built-in method
		
        char[] arr2 = text.toCharArray();

        // Comparing both character arrays
		
        boolean result = compareArrays(arr1, arr2);

        // Displaying result
		
        System.out.println("Both character arrays same : " + result);
    }

    // Method to get characters without using toCharArray
	
    public static char[] getChars(String text) {

        // Creating char array of same length
		
        char[] arr = new char[text.length()];

        // Loop to store each character
		
        for (int i = 0; i < text.length(); i++) {
            arr[i] = text.charAt(i);
        }

        return arr;
    }

    // Method to compare two char arrays
	
    public static boolean compareArrays(char[] a, char[] b) {

        // Length check
		
        if (a.length != b.length)
            return false;

        // Element by element comparison
		
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i])
                return false;
        }

        return true;
    }
}
