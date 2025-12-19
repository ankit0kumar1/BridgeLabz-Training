import java.util.*;
public class MeanHeight {
	public static void main (String [] args) {
		Scanner input = new Scanner (System.in);
		
		double height [] = new double[11];
		// Taking input from the user.
		for (int index =0 ; index < height.length; index++) {
			System.out.print("Enter the height of player " + (index+1) + ": ");
			height[index] = input.nextDouble();
		}
		
		// Finding sum 
		double sum =0;
		for(double element: height){
			sum += element;
		}
		double mean = sum/11;
		
		System.out.println("The mean height of the football team is: " + mean);
		
		input.close();
	}
}