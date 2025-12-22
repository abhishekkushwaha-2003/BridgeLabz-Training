// Create a class StudentVoting to check students who are eligible for vote

import java.util.Scanner;

public class StudentVoting{
	public static void main(String[] args){
	
	// Creating scanner object to take input 
		
		Scanner sc = new Scanner (System.in);
		
        //System.out.print("Enter Age : ");
		
		int arr[]= new int[10];
		
		for(int i = 0; i<arr.length; i++){
			
			System.out.print("Enter the age of "+(i+1)+" student : ");
			arr[i] = sc.nextInt();
		}
			
			for(int j = 0;j< arr.length; j++){
				
				if(arr[j] >= 18){
					
				System.out.println( "The student with the age "+arr[j]+" can vote");	
				} else if (arr[j] <0 ){
					
					System.out.println( "Student age is Invalid!");	
					
				} else {
				
			 	System.out.println( "The student with the age "+arr[j]+" cannot vote");	

			}
			}
			
		  sc.close();
		    
		}
		
	}