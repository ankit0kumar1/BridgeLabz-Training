/*
19. Bus Route Distance Tracker 🚌
Each stop adds distance.
● Ask if the passenger wants to get off at a stop.
● Use a while-loop with a total distance tracker.
● Exit on user confirmation.
*/
import java.util.*;
public class DistanceTracker{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		String [] stops = {"Anand Nagar", "Ratnagiri","Piplani","Indrapuri", "ISBT", "Bhopal Station","DB City", "MP nagar","Lake view", "Rani Kamlapati" };
		int [] distance = {5,7,3,2,5,7,6,4,5,1};
		int totalDistance =distance[0];
		while(true){
			for(int i =0; i <stops.length; i++){
				System.out.println("Want to stop at " + stops[i] +"(y/n) : ");
				char ch = input.next().charAt(0);
				if(ch == 'y' ||ch == 'Y'){
					System.out.println("Destination Reached");
					System.out.println("Total distance travelled is: "+ totalDistance);
					System.exit(0);
				}else{
					totalDistance+= distance[i];
				}
			}
		}
		
	}
}