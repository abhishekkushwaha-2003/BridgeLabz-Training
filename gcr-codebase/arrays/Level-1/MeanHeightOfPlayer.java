// Create a program to find the mean height of players present in a football team

import java.util.Scanner;

// create a class MeanHeightOfPlayer to find the mean height of players 

public class MeanHeightOfPlayer {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Array to store heights of 11 players
        double[] heights = new double[11];

        double sum = 0;

        // Input heights
        for (int i = 0; i < 11; i++) {
            System.out.print("Enter height of player " + (i + 1) + ": ");
            heights[i] = sc.nextDouble();
            sum = sum + heights[i];
        }

        // Calculate mean
        double mean = sum / 11;

        System.out.printf("Mean height of football team =  %.2f", mean);

        sc.close();
    }
}
