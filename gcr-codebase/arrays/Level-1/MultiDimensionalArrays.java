// Working with Multi-Dimensional Arrays. Write a Java program to create a 2D Array and Copy the 2D Array into a single dimension array


import java.util.Scanner;

// Create a class MultiDimensionalArrays to create a 2-D Array

public class MultiDimensionalArrays {
    public static void main(String[] args) {
	
	// Taking input from user

        Scanner sc = new Scanner(System.in);

		// taking input of rows

        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
		
		// Taking input of columns

        System.out.print("Enter columns: ");
        int cols = sc.nextInt();
		
		// creating single and 2-D array

        int[][] matrix = new int[rows][cols];
        int[] array = new int[rows * cols];

        // Input matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int index = 0;

        // Copy 2D to 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[index++] = matrix[i][j];
            }
        }

        // Display 1D array
        System.out.println("1D Array:");
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");

        sc.close();
    }
}
