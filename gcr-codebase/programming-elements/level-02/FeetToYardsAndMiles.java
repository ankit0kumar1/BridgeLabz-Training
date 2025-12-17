import java.util.Scanner;
public class FeetToYardsAndMiles{
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		
		//Taking user inputs
		System.out.print("Enter distance in feet: ");
		double feet = input.nextDouble();
		
		double yard = feet/3;
		double mile =  yard/1760;
		
		//Displaying the result
		System.out.println("The distance in yards is " + yard + " while the distance in miles is " + mile );
		
		input.close();//closing Scanner object
	}	
}