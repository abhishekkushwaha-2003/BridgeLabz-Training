/*16. Digital Watch Simulation ⏱️
Simulate a 24-hour watch:
● Print hours and minutes in a nested for-loop.
● Use a break to stop at 13:00 manually (simulate power cut).
Core Java Scenario Based Problem Statements*/

public class DigitalWatchSimulation{
	public static void main(String[] args){

		// loop for hours
		for(int hour = 0; hour < 24; hour++){

			// loop for minutes
			for(int minute = 0; minute < 60; minute++){

				// printing time
				System.out.println(hour + " : " + minute);

				// power cut condition
				if(hour == 13 && minute == 0){
					System.out.println("Power Cut! Watch stopped.");
					break;
				}
			}

			// breaking outer loop also
			if(hour == 13){
				break;
			}
		}
	}
}
