package com.consturctors.level1;

public class CarRental {
	  private String customerName;
	  private String carModel;
	  private int rentalDays;
	  //parameterized constructor
	  CarRental(String customerName, String carModel, int rentalDays){
	      this.customerName = customerName;
	      this.carModel = carModel;
	      this.rentalDays = rentalDays;
	  }
	  //Method to calculate total rent
	  public int calculateTotalRent() {
	      int ratePerDay = 1999; 
	      return rentalDays * ratePerDay;
	  }
	  public String toString() {
	      return "Customer Name: " + customerName +
	             "\nCar Model: " + carModel +
	             "\nRental Days: " + rentalDays +
	             "\nTotal Cost: " + calculateTotalRent();
	  }
	  public static void main(String[] args) {
	      
	      CarRental rental1 = new CarRental("Alice", "Toyota Camry", 5);
	      System.out.println(rental1);
	      CarRental rental2 = new CarRental("Bob", "Honda Civic", 3);
	      System.out.println("\n" + rental2);
	  }
	}