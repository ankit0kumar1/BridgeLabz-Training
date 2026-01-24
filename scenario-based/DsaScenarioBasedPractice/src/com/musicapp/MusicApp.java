package com.musicapp;

public class MusicApp {
	public static void main(String [] args) {
		SongBst playlist = new SongBst();
		
		//insert track
		playlist.insert(107, "Jo Tum Mere Ho", "Anuv Jain");
		playlist.insert(102, "Labon Ko", "Pritam, KK");
		playlist.insert(105, "The Greatest", "Sia");
		playlist.insert(112, "Faasle", "Aditya Rikhari");
		playlist.insert(120, "Tareefe", "Badsha");
		playlist.insert(111, "Unstopable ", "Dino James");
		
		Track track = playlist.search(102);
		System.out.println("Searching song" );
		if(track!= null) System.out.println("Found: " + track.title + " By: " + track.artist);
		else System.out.println("Track Not found");
		
		playlist.showPlaylist();
	}
}
