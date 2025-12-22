//  Create a program to find the youngest friends among 3 Amar, Akbar and Anthony based on their ages and tallest among the    //  friends based on their heights and display it

//  program to find the youngest friends and the tallest among the friends based on their heights


import java.util.Scanner;
public class ThreeFriends {
	
	public static void main(String [] args){
	
		//creating a scanner object
		Scanner sc = new Scanner(System.in);
	
		//taking input age and height
	
		//array initialize for storing age and height
		int [] ages = new int[3];
		double [] height = new double[3];
	
		//taking input age and height
		for(int i = 0; i < 3; i++){
			System.out.print("Enter age of " + names[i] + ": ");
			ages[i] = sc.nextInt();
		
			System.out.print("Enter height of " + names[i] + " (in cm): ");
			height[i] = sc.nextDouble();
	
		}
		

		// Finding youngest and tallest friend
		String youngest = findYoungest(ages);
		String tallest = findTallest(height);

		// Displaying results
		System.out.println("\nYoungest friend: " + youngest);
		System.out.println("Tallest friend: " + tallest);
	
		sc.close();
	}

//names of three friends
	static String[] names = {"Amar", "Akbar", "Anthony"};
	
	// Method to find the youngest friend
    public static String findYoungest(int[] ages) {

        int minAge = ages[0];
        int index = 0;

        // Loop to find minimum age
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                index = i;
            }
        }

        // Return name of youngest friend
        return names[index];
    }

    // Method to find the tallest friend
    public static String findTallest(double[] heights) {

        double maxHeight = heights[0];
        int index = 0;

        // Loop to find maximum height
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                index = i;
            }
        }
		
		// Return name of tallest friend
        return names[index];
		
	}
}



	