package com.tourmate;

import java.util.*;

public abstract class Trip implements IBookable{
	protected String location;
	protected double budget;
	protected int numberOfDays;
	protected String tripType ;
	
	
	
	 protected Transport transport;
	 protected Hotel hotel;
	 protected List<Activity> activities;
	
	public Trip(String location, double budget, int numberOfDays, Transport transport , Hotel hotel , List<Activity> activites) {
		this.location = location;
		this.budget = budget;
		this.numberOfDays = numberOfDays;
		this.transport = transport;
		this.hotel = hotel;
		this.activities = activites;
	}
	
	
	
	public abstract void book();
	public void cancel() {
		System.out.println("Trip to destination "+ location  +" cancelled.");
	}
	
	// Total cost = hotel + activites + transport
	public  double getTotalCost() {
		
		double activityCost =0;
		 for (Activity activity : activities) {
			activityCost += activity.getCost();
		}
		return hotel.getCost()+activityCost + transport.getCost();
	}
	
}
