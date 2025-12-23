// Create a class MatrixAdvanced to perform matrix manipulation operations like finding the transpose, determinant, and inverse of a matrix

import java.util.Random;

public class MatrixManipulation {

    public static void main(String[] args) {

        // Creating random 3x3 matrix
		
        int[][] matrix = createRandomMatrix(3, 3);

        // Display original matrix
		
        System.out.println("Original Matrix:");
        printMatrix(matrix);

        // Transpose of matrix
		
        System.out.println("Transpose Matrix:");
        int[][] trans = transposeMatrix(matrix);
        printMatrix(trans);

        // Determinant of 2x2 matrix
		
        int[][] mat2 = createRandomMatrix(2, 2);
        System.out.println("2x2 Matrix:");
        printMatrix(mat2);
        System.out.println("Determinant (2x2): " + determinant2x2(mat2));

        // Determinant of 3x3 matrix
		
        System.out.println("Determinant (3x3): " + determinant3x3(matrix));

        // Inverse of 2x2 matrix
		
        System.out.println("Inverse of 2x2 Matrix:");
        inverse2x2(mat2);

        // Inverse of 3x3 matrix
		
        System.out.println("Inverse of 3x3 Matrix:");
        inverse3x3(matrix);
    }

    // Method to create random matrix
	
    public static int[][] createRandomMatrix(int rows, int cols) {

        int[][] mat = new int[rows][cols];
        Random r = new Random();

        // Filling matrix with random values
		
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = r.nextInt(5) + 1;
            }
        }
        return mat;
    }

    // Method to find transpose of matrix
    public static int[][] transposeMatrix(int[][] mat) {

        int rows = mat.length;
        int cols = mat[0].length;

        int[][] trans = new int[cols][rows];

        // Swapping rows and columns
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                trans[j][i] = mat[i][j];
            }
        }
        return trans;
    }

    // Method to find determinant of 2x2 matrix
    public static int determinant2x2(int[][] mat) {

        // Formula: ad - bc
        int det = (mat[0][0] * mat[1][1]) - (mat[0][1] * mat[1][0]);
        return det;
    }

    // Method to find determinant of 3x3 matrix
    public static int determinant3x3(int[][] m) {

        // Using standard formula
        int det =
                m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1])
              - m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0])
              + m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);

        return det;
    }

    // Method to find inverse of 2x2 matrix
    public static void inverse2x2(int[][] mat) {

        int det = determinant2x2(mat);

        // Checking determinant
        if (det == 0) {
            System.out.println("Inverse not possible");
            return;
        }

        // Formula for inverse
        System.out.println(mat[1][1] / (double) det + " " + (-mat[0][1]) / (double) det);
        System.out.println((-mat[1][0]) / (double) det + " " + mat[0][0] / (double) det);
    }

    // Method to find inverse of 3x3 matrix
    public static void inverse3x3(int[][] m) {

        int det = determinant3x3(m);

        // If determinant is zero, inverse not possible
        if (det == 0) {
            System.out.println("Inverse not possible");
            return;
        }

        // Cofactor method (simple way)
        double[][] inv = new double[3][3];

        inv[0][0] =  (m[1][1]*m[2][2] - m[1][2]*m[2][1]) / (double) det;
        inv[0][1] = -(m[0][1]*m[2][2] - m[0][2]*m[2][1]) / (double) det;
        inv[0][2] =  (m[0][1]*m[1][2] - m[0][2]*m[1][1]) / (double) det;

        inv[1][0] = -(m[1][0]*m[2][2] - m[1][2]*m[2][0]) / (double) det;
        inv[1][1] =  (m[0][0]*m[2][2] - m[0][2]*m[2][0]) / (double) det;
        inv[1][2] = -(m[0][0]*m[1][2] - m[0][2]*m[1][0]) / (double) det;

        inv[2][0] =  (m[1][0]*m[2][1] - m[1][1]*m[2][0]) / (double) det;
        inv[2][1] = -(m[0][0]*m[2][1] - m[0][1]*m[2][0]) / (double) det;
        inv[2][2] =  (m[0][0]*m[1][1] - m[0][1]*m[1][0]) / (double) det;

        // Printing inverse matrix
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(inv[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Method to display matrix
    public static void printMatrix(int[][] mat) {

        // Printing row by row
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
