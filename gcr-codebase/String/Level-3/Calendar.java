// Write a program to display calendar for a given month and year


import java.util.Scanner;

public class Calendar{

    // method for name of the month
	
    public static String getMonthName(int month) {
        String[] months = {"January", "February", "March", "April", "May", "June",
                           "July", "August", "September", "October", "November", "December"};
        return months[month - 1]; // return name of the month
    }

    // method to check if a year is leap year
	
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // method to get number of days in a month
	
    public static int getNumberOfDays(int month, int year) {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month == 2 && isLeapYear(year)) {
            return 29; // February in leap year
        }
        return days[month - 1];
    }

    // method to get the first day of the month using Gregorian calendar algorithm
	
    public static int getFirstDayOfMonth(int month, int year) {
        int m = month;
        int y = year;

        if (m < 3) {
            m += 12;
            y -= 1;
        }

        int k = y % 100;
        int j = y / 100;

        int d0 = (1 + (13 * (m + 1)) / 5 + k + k / 4 + j / 4 + 5 * j) % 7;
        int day = ((d0 + 6) % 7); // adjust to 0=Sunday
        return day;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ask user to enter month and year
		
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        // get month name and number of days
		
        String monthName = getMonthName(month);
        int numOfDays = getNumberOfDays(month, year);

        // get first day of the month
		
        int firstDay = getFirstDayOfMonth(month, year);

        // display month and year
		
        System.out.println("\n    " + monthName + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // print spaces for first day
		
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        // print all days of the month
		
        for (int day = 1; day <= numOfDays; day++) {
            System.out.printf("%3d ", day);

            // move to next line after Saturday
			
            if ((firstDay + day) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();

        sc.close(); // close scanner
    }
}
