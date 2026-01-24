package com.musicapp;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SongBst {
	Track root;
	
	//insert new song
	public void insert(int trackId, String title, String aritst) {
		root = insertSong(root, trackId, title, aritst);
	}
	private Track insertSong(Track root, int trackId, String title, String artist) {
		if(root == null) {
			return new Track(trackId, title,artist);
		}
		if(trackId < root.trackId) {
			root.left= insertSong(root.left, trackId, title, artist);
		}else if (trackId > root.trackId) {
			root.right = insertSong(root.right, trackId, title, artist);
		}
		return root;
	}
	
	//search 
	public Track search(int trackId) {
		return searchRecord(root, trackId);

	}
	private Track searchRecord(Track root , int trackId) {
		if(root == null || root.trackId ==trackId) {
			return root;
		}
		if(trackId< root.trackId) {
			return	searchRecord(root.left, trackId);
		}
		return searchRecord(root.right, trackId);
	}
	
	public void showPlaylist() {
		List<Track> list = new ArrayList<>();
		collectTracks(root,list);
		
		list.sort(Comparator.comparing(t -> t.title.toLowerCase()));
		
		System.out.println("\nPlaylist(Alphabetical by Title)");
		
		for(Track t : list) {
			System.out.println(t.title + " by " + t.artist + " Id: " + t.trackId);
		}
	}
	
	private void collectTracks(Track root, List<Track> list) {
		if(root!= null) {
			collectTracks(root.left, list);
			list.add(root);
			collectTracks(root.right, list);
		}

		
	}

}
