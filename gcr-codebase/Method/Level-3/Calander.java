// create a class Calendar  to display a calendar for a given month and year

import java.util.*;
public class Calander{
	
	public static void main(String[] args){
		
        Scanner sc = new Scanner(System.in);
        //Take month and year input 
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        //Display month name and year
        System.out.println("\n   " + getMonthName(month) + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        int firstDay = getFirstDay(1, month, year);
        int daysInMonth = getDaysInMonth(month, year);
		
		
		//Display the Days
        for(int i=0; i<firstDay; i++){
            System.out.print("    ");
        }
        //Print all days of the month in calendar format
        for(int day=1; day<=daysInMonth; day++){
            System.out.printf("%3d ", day);
            if((day + firstDay)%7==0){
                System.out.println();
            }
        }
    }
	
	
    //Name of the month
    public static String getMonthName(int month){
        String[] months={
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        return months[month-1];
    }
    //Create a method to check for Leap year
    public static boolean isLeapYear(int year){
		boolean isLeap = (year%400 == 0 || (year%4 == 0 && year%100 != 0));
        return isLeap;
    }
    //Number of days in a given month
    public static int getDaysInMonth(int month, int year){
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if(month==2 && isLeapYear(year)){
            return 29;
        }
        return days[month - 1];
    }
    //First day of the month using Gregorian formula
    public static int getFirstDay(int d, int m, int y){
        int y0 = y-(14-m)/12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = m + 12*((14 - m)/12)-2;
        int d0 = (d + x + (31*m0)/12)%7;
        return d0;
    }

}