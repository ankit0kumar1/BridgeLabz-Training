package com.musicapp;

public class Track {
	int trackId;
	String title;
	String artist;
	
	Track left, right;
	
	public Track(int trackId, String title, String artist) {
		this.trackId = trackId;
		this.title = title;
		this.artist = artist;
		left = right = null;
	}
	
	@Override
	public String toString() {
		return "Track id: " + trackId + " Name: "+ title + " Artist: " + artist;
	}
}
