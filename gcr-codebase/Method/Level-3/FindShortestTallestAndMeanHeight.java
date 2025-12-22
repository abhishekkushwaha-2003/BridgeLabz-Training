// Create a program to find the shortest, tallest, and mean height of players present in a football team.



// Create a class FindShortestTallestAndMeanHeight to find the shortest, tallest, and mean height of players present in a football team

import java.util.Random;

public class FindShortestTallestAndMeanHeight{
	public static void main(String [] args){
	
	
		int heights [] = randomValue(11);
		
		//display a random values
		for(int i = 0; i<heights.length; i++){
			System.out.println((i+1) +" Random Height is : "+ heights[i]);
		}
		
		//find a mean of heights
		double mean = findMeanHeight(heights);
		
		//find shortest height
		int shortest = shortestHeight(heights);
		
		//find tallest Height
		int tallest = tallestHeight(heights);
		
		
		System.out.println("The shortest height of the players on the football team is : "+ shortest);
		
		System.out.println("The tallest height of the players on the football team is : "+ tallest);
		
		System.out.println("The mean height of the players on the football team is : "+ mean);
		
		
	
	
	// 
	
	}
	
	// Create a method randomValue to get any random integer value
	
	public static int [] randomValue(int size){
	
		int [] heights = new int[size];
		Random random = new Random();
		int max = 250;
		int min = 150;
		
		for(int i = 0; i<heights.length; i++){
			heights[i] = random.nextInt(max - min + 1) + min;
			
		}
		
		return heights;
		
	}
	
	
	// Create a method findSum to Find the sum of all the elements present in the array.
	
	public static int findSum(int heights[]){
		
		int sum = 0;
		//travers a heights array and find sum
		for(int i = 0; i<heights.length; i++){
			sum += heights[i];
		}
		return sum;
	}
	
	// Create a method findMeanHeight to find the mean height of the players on the football team
	
	public static double findMeanHeight(int heights[]){
	
		int sum = findSum(heights);
		double mean = sum / heights.length;
		
		return mean;
	}
	
	// Create a method shortestHeight to find the shortest height of the players on the football team
	
	public static int shortestHeight(int heights[]){
	
		int minHeight = heights[0];
		
		for(int i = 1; i<heights.length; i++){
			if(minHeight > heights[i]){
				minHeight = heights[i];
			}
		}
		return minHeight;
	
	}
	
	// Create a method tallestHeight to find the tallest height of the players on the football team
	
	public static int tallestHeight(int heights[]){
		
		int maxHeight = heights[0];
		
			for(int i = 1; i<heights.length; i++){
			if(maxHeight < heights[i]){
				maxHeight = heights[i];
			}
		}
		return maxHeight;
	
	}
	
	
}