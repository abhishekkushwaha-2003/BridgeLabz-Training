// Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based on their ages and the tallest among the friends based on their heights

import java.util.Scanner;

// create a class YoungestAndTallestFriend to find the youngest anfd tallest friend 

public class YoungestAndTallestFriend {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] age = new int[3];
        double[] height = new double[3];

        // Taking input from user
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details of " + names[i]);

            System.out.print("Age: ");
            age[i] = sc.nextInt();

            System.out.print("Height: ");
            height[i] = sc.nextDouble();
        }

        int youngest = 0;
        int tallest = 0;

        // Finding youngest and tallest
        for (int i = 1; i < 3; i++) {

            if (age[i] < age[youngest])
                youngest = i;

            if (height[i] > height[tallest])
                tallest = i;
        }

        System.out.println("Youngest Friend is : " + names[youngest] + " And the Tallest Friend is : " + names[tallest]);
        System.out.println();
    }
}
