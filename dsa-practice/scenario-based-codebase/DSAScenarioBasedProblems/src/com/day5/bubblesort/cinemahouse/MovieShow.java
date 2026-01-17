package com.day5.bubblesort.cinemahouse;

public class MovieShow {
	String movieName;
	int showTime;
	// constructor 
	public MovieShow(String movieName, int showTime) {
		this.movieName=movieName;
		this.showTime=showTime;
		
	}
	// method to display movie details
	public void display() {
		System.out.println("Movie: "+movieName+", Show Time : "+showTime);
	}
}
