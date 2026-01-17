package com.cinemahouse;

class Show {
	String movieName;
	int time; // showtime in minutes (e.g., 930 = 9:30 AM)

	Show(String movieName, int time) {
		this.movieName = movieName;
		this.time = time;
	}
}
