package com.artify;

public class DigitalArt extends ArtWork {

	public DigitalArt(String title, String artist, double price) {
		super(title, artist, price);

	}
	
	public void applyLicense() {
		licenseType = "Personal / subscription";
		System.out.println("Digital License applied : For personal use only.");

	}

}
