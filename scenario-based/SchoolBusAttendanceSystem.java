import java.util.Scanner;
public class SchoolBusAttendanceSystem{
	public static void main (String [] args){
		
		// create a scanner object 
		Scanner sc = new Scanner(System.in);
		
		// declare string array of student names
		String [] studentName = {"Abhishek", "Rajeev", "Anirudh", "Karan", "Ansh", "Titu", "Aaditya", "Ajay", "Yash", "Ayush"};
		
		// create variables present and absent to count students are present or absent
		int present = 0, absent = 0;
		
		// using for each loop 
		for(String str : studentName){
		System.out.println(str);
		System.out.println("Present or Absent");
		
		//
		System.out.println("Mark p for Present and a for Absent");
		char ch = sc.next().toLowerCase().charAt(0);
		
		// checking for present or absent
		if(ch == 'p'){
		present++;
		}else{
		absent++;
		}
	
	}   
		// displaying total number of present and absent students
		
		System.out.println();
		System.out.println("Total number of Present students : "+present);
		System.out.println("Total number of Absent students : "+absent);
		
		sc.close();
	
	}
}