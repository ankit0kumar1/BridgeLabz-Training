import java.util.*;
public class SpringSeason {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//get month and day form the user
		System.out.print("Enter the current month in numbers: ");
		int month = input.nextInt();
		System.out.print("Enter the current day: ");
		int day = input.nextInt();
		
		//checking season is spring or not 
		if((month == 3 && day>=20) || 
			month == 4 ||
			month == 5 ||
		   (month == 6 && day<=20)){
		   System.out.println("It's Spring Season");
		}else{
		    System.out.println("Not a Spring Season");
		}
		
		input.close();
		
	}
}