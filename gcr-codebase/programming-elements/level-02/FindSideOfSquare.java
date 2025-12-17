import java.util.Scanner;
public class FindSideOfSquare{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
		//Taking inputs form the user.
		System.out.print("Enter the perimeter of the square: ");
		double perimeter = input.nextDouble();
		//Finding the side of the square 
		double side = perimeter/4;
		
		//displaying the ouput
		System.out.println("The length of the side is "+ side +" whose perimeter is " + perimeter);
		
		input.close();
	}
}