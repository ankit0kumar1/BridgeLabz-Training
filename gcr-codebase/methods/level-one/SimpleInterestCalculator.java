import java.util.*;
public class SimpleInterestCalculator{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
		//Taking input from the user
		System.out.print("Enter a principal: ");
		double principal = input.nextInt();
		System.out.print("Enter rate: ");
		double rate = input.nextDouble();
		System.out.print("Enter time(in years): ");
		double time = input.nextDouble();
		
		//Call the method to calculate simple intrest
		double simpleIntrest =getSI(principal , rate , time);
		
		//Displaying the output 
		System.out.println("The Simple Interest is " + simpleIntrest + " for Principal "+
		principal+ ", Rate of Interest "+ rate +" and Time " + time);
		
		input.close();
	}
	
	static double getSI(double principal, double rate, double time){
		double simpleIntrest = (principal*rate*time)/100.0;
		return simpleIntrest;
	}
}