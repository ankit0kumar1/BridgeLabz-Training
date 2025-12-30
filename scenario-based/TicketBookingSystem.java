/*
12. Train Reservation Queue 🚆
Simulate a basic ticket booking system.
● Show menu with switch
● Allow multiple bookings using while-loop.
● Stop booking once seats reach zero (break).
*/

import java.util.*;
public class TicketBookingSystem{
	

	public static void main(String [] args){
		
		Scanner input = new Scanner (System.in);
		
		int totalSeats = 20;
		int occupied =0;
		//Welcome message
		System.out.println("Welcome to the ticket counter.");
		
		while(true){
		//Taking distance form user
			System.out.println("Enter distance in km: ");
			double distance = input.nextDouble();
			System.out.println("Enter the station from: ");
			String stationFrom = input.next();
			System.out.println("Enter the station to: ");
			String stationTo = input.next();
			
			int amount =0;
			if(distance>0 && distance <=100){
				amount =  150;
			}else if(distance>100 && distance <300){
				amount = 250;
			}else if (distance <750){
				amount = 700;
			}else if(distance <1500){
				amount = 1500;
			}else{
				amount = 25000;
			}
			System.out.println ("Choose 1 to book ticket \n2 to exit \n3 to check the number of seats left.");
			int choose = input.nextInt();
			//switch case
			switch(choose){
				case 1: System.out.println("Tickect booked successfully and billed amount is: " + amount);
						System.out.println("From "+ stationFrom + " to station " + stationTo);
					occupied++;
					break;
				
				case 2 : System.out.println("Exit Successfully");
					System.exit(0);
					break;
				case 3 : System.out.println("Seats left: "+ (totalSeats-occupied) + "out of: "+ totalSeats );
					break;
			}
			
			if(occupied== totalSeats){
				System.exit(0);
			}
		}
		
		
		
	}
}