package com.streamapi.top5trendingmovie;

public class Movie {
	String name ;
	double rating;
	int releaseYear;
	
	public Movie(String name, double rating, int realseYear) {
		this.name = name;
		this.rating = rating;
		this.releaseYear = realseYear;
	}
	public String getName() {
		return name;
	}
	public double getRating() {
		return rating;
	}
	public int getReleaseYear() {
		return releaseYear;
	}
	@Override
	public String toString() {
		return name + " Rating: " + rating + "( " + releaseYear +" )" ;
		
	}
	
	
}
