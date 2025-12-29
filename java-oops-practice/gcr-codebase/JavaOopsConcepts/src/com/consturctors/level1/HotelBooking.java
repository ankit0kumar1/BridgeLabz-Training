package com.consturctors.level1;

public class HotelBooking {
	
	private String guestName;
	private int roomType;
	private int nights;
	
	//Default Constructor
	HotelBooking(){
		this.guestName = "Default Guest";
		this.roomType = 1;
		this.nights = 1;
	}
	
	//Parameterized Constructor
	HotelBooking(String guestName , int roomType , int nights){
		
		this.guestName = guestName;
		this.roomType = roomType;
		this.nights= nights;
	}
	
	//Copy Constructor
	HotelBooking(HotelBooking other){
		this.guestName = other.guestName;
		this.roomType = other.roomType;
		this.nights = other.nights;
	}
	
	//Getter methods 
	public String getGuestName() {
		return this.guestName;
	}
	public int getRoomType() {
		return this.roomType;
	}
	public int getNights() {
		return this.nights;
	}
	
	//Display method 
	public void displayBooking() {
		System.out.println("Guest Name: " + guestName + ", Room Type: " + roomType + ", Nights: " + nights);
	}
	
	

	public static void main(String[] args) {
		//using default constructor
		HotelBooking defaultBooking = new HotelBooking();
		defaultBooking.displayBooking();
		
		//using Parameterized constructor
		HotelBooking customBooking = new HotelBooking("Alice",2,3);
		customBooking.displayBooking();
		
		//using copy constructor
		HotelBooking copyBooking = new HotelBooking(customBooking);
		copyBooking.displayBooking();
		
	}

}
