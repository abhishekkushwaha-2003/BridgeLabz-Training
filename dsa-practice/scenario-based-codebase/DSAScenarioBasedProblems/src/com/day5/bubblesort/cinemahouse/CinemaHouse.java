package com.day5.bubblesort.cinemahouse;

public class CinemaHouse {
	public static void sortByShowTime(MovieShow[] shows) {
		int n = shows.length;
		// outer loop control number of passes
		for(int i=0; i<n-1; i++) {
			// inner loop compare show timing
			for(int j=0; j<n-i-1; j++) {
				if(shows[j].showTime >  shows[j + 1].showTime) {
					MovieShow temp = shows[j];
					shows[j]=shows[j+1];
					shows[j+1]=temp;
				}
			}
		}
	}
	
	// method to display all movie shows
	
	public static void displayShows(MovieShow[] shows) {
		for(MovieShow show : shows) {
			show.display();
		}
	}
}
