// Create a class MatrixOperations to perform matrix manipulation operations like addition, subtraction, and multiplication

import java.util.Random;

public class MatrixManipulationOperations {

    public static void main(String[] args) {

        //creating two variable for rows and columns
        int rows = 2;
        int cols = 3;

        // Creating random matrices
		
        int[][] A = createRandomMatrix(rows, cols);
        int[][] B = createRandomMatrix(rows, cols);

        // Displaying Matrix A
		
        System.out.println("Matrix A:");
        printMatrix(A);

        // Displaying Matrix B
		
        System.out.println("Matrix B:");
        printMatrix(B);

        // Addition of matrices
		
        System.out.println("Addition of A and B:");
        int[][] add = addMatrices(A, B);
        printMatrix(add);

        // Subtraction of matrices
		
        System.out.println("Subtraction of A and B:");
        int[][] sub = subtractMatrices(A, B);
        printMatrix(sub);

        // For multiplication
		
        int[][] C = createRandomMatrix(cols, rows);

        System.out.println("Matrix C:");
        printMatrix(C);

        // Multiplication of matrices
		
        System.out.println("Multiplication of A and C:");
        int[][] mul = multiplyMatrices(A, C);
        printMatrix(mul);
    }

    // Method to create random matrix
	
    public static int[][] createRandomMatrix(int rows, int cols) {

        // Creating matrix
        int[][] matrix = new int[rows][cols];

        // Random class object
        Random r = new Random();

        // Filling matrix with random values
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = r.nextInt(10); // values between 0 to 9
            }
        }

        // Returning matrix
        return matrix;
    }

    // Method to add two matrices
    public static int[][] addMatrices(int[][] A, int[][] B) {

        int rows = A.length;
        int cols = A[0].length;

        // Result matrix
        int[][] result = new int[rows][cols];

        // Adding corresponding elements
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }

        return result;
    }

    // Method to subtract two matrices
    public static int[][] subtractMatrices(int[][] A, int[][] B) {

        int rows = A.length;
        int cols = A[0].length;

        // Result matrix
        int[][] result = new int[rows][cols];

        // Subtracting corresponding elements
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] - B[i][j];
            }
        }

        return result;
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] A, int[][] B) {

        int rowsA = A.length;
        int colsA = A[0].length;
        int colsB = B[0].length;

        // Result matrix
        int[][] result = new int[rowsA][colsB];

        // Multiplication logic
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] = result[i][j] + A[i][k] * B[k][j];
                }
            }
        }

        return result;
    }

    // Method to print matrix
    public static void printMatrix(int[][] matrix) {

        // Loop for rows
        for (int i = 0; i < matrix.length; i++) {

            // Loop for columns
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }

           
            System.out.println();
        }
    }
}
