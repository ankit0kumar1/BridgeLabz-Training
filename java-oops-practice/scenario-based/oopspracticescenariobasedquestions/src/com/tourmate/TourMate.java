package com.tourmate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TourMate {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("===== Welcome to TourMate ===== ");
		
		//basic trip details
		System.out.println("Enter Destination");
		String destination = input.nextLine();
		
		System.out.println("Choose Trip type (1. Domestic / 2. International)");
		int choice = input.nextInt();
		
		System.out.println("Enter Duration(days): ");
		int duration = input.nextInt();
		
		//Transport details
		System.out.println("Enter Transport type(Flight / Train / Bus): ");
		String type = input.next();
		
		System.out.println("Enter Buget: ");
		double buget = input.nextDouble();
		
		System.out.println("Enter Base Fare: ");
		double baseFare = input.nextDouble();
		
		Transport transport = new Transport(type, baseFare, duration);
		
		//Hotel details
		input.nextLine();	 //consume newLine
		System.out.println("Enter Hotel Name: ");
		String hotelName = input.nextLine();
		
		System.out.println("Enter cost per night: ");
		double costPerNight = input.nextDouble();
		
		Hotel hotel = new Hotel(hotelName, costPerNight, duration);
		
		//Activities
		List<Activity> activities = new ArrayList<>();
		System.out.println("Enter number of activities: ");
		int activityCount = input.nextInt();
		
		input.nextLine();
		
		for(int i =0; i < activityCount ; i++) {
			System.out.println("Activity Name");
			String actName = input.nextLine();
			
			System.out.println("Activity Cost: ");
			double actCost = input.nextDouble();
			input.nextLine();
			
			activities.add(new Activity(actName, actCost));
		}
		
		Trip trip;
		
		if(choice ==2) {
			System.out.println("Passport valid ? (true/false): ");
			boolean passportValid = input.nextBoolean();
			
			System.out.println("Visa approved? (true/false): ");
			boolean visaApproved = input.nextBoolean();
			
			System.out.println("Insurance done? (true/false): ");
			boolean insuranceDone = input.nextBoolean();
			
			trip = new InternationalTrip(destination, buget, activityCount, transport, hotel, activities, passportValid, visaApproved, insuranceDone);
		}else {
			trip = new DomesticTrip(destination, buget, activityCount, transport, hotel, activities);
		}
		
		System.out.println("\nTotal trip cost: ₹" + trip.getTotalCost());
		
		trip.book();
		
		//optional cancel
		System.out.println("\nCancel trip? (yes/no): ");
		
		String cancelchoice = input.next();
		
		if(cancelchoice.equalsIgnoreCase("yes")) {
			trip.cancel();
		}
		System.out.println("====== Thank you for using TourMate ======");
		
	}
}
