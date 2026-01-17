package com.day5.bubblesort.cinemahouse;

public class CinemaHouseApp {
	public static void main (String [] args) {
		MovieShow [] shows = {
				new MovieShow("Jawan",1500),
				new MovieShow("RRR",1200),
				new MovieShow("Swadesh",1400),
				new MovieShow("Dangal",1370),
				new MovieShow("Kalki",1460)
		};
		
		System.out.println("Before Sorting : ");
		CinemaHouse.displayShows(shows);
		
		CinemaHouse.sortByShowTime(shows);
		System.out.println("After Sorting By Show Time : ");
		CinemaHouse.displayShows(shows);
		
		
	}
}
