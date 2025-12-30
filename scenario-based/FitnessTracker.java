import java.util.Scanner;
public class FitnessTracker{
	public static void main (String[] args){
		Scanner sc = new Scanner (System.in);
	    int [] week = new int [7];
			for(int i=0; i<week.length; i++){
				System.out.println("Enter Number of pushups of Day "+(i+1)+" : ");
				week[i]=sc.nextInt();
		}
		int workoutDays = 0;
		int total = 0;
		for(int i : week){
			if(i ==0 ){
				continue;
			}
			total+=i;
			workoutDays++;
		}
		System.out.println("Total number of pushups are : "+ total);
		if(workoutDays>0){
			System.out.println("The Average of pushups per Day are : "+ total/workoutDays);
		}else{
			System.out.println("No Workout");	
		}
		sc.close();
	}
}