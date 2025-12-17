import java.util.Scanner;
public class ConvertDistance{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		//Taking user inputs
		System.out.print("Enter distance in Kilometer: ");
		int km = input.nextInt();
		//converting distance to miles from kilometer
		double miles = km/1.6;
		//displaying the output
		System.out.println("The total miles is "+ miles + " mile for the given " + km +" km.");
		
		input.close();//closing the scanner object
	}
}