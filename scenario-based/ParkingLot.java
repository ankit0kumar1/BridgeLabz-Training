import java.util.*;
public class ParkingLot{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		int capacity = 10;
		boolean occupyStatus = false;
		int currentOccupied = 0;
		System.out.println("Welcome to Parking Lot");
		while(true){
		
			System.out.println("Enter 1 to park, 2 to exit ,and 3 to show occpancy");
			int number = input.nextInt();
			if(number==2){
				System.out.println("Thank You! Visit again");
				break;
			}
			if(currentOccupied == capacity ){
				System.out.println("Sorry! Parking Lot full.");
				break;
			}else{
				
				switch(number){
					case 1 : System.out.println("Parked Successfully.");
					currentOccupied++;
					System.out.println();
					break;

					case 3 : System.out.println("Occupancy " + capacity + "current occupied "+ currentOccupied);
				}
			}
		}
	}
}