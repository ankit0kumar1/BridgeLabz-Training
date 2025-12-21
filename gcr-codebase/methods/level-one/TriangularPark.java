import java.util.Scanner;
public class TriangularPark{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		//Get the Length of the sides of the triangle form the user
		System.out.print("Enter the length of side one of triangle in meters: ");
		double sideOne = input.nextDouble();
		
		System.out.print("Enter the length of side second of triangle in meters: ");
		double sideTwo = input.nextDouble();
		
		System.out.print("Enter the length of side third of triangle in meters: ");
		double sideThree = input.nextDouble();
		
		
		int result = getNumberOfRounds(sideOne , sideTwo, sideThree);
		
		System.out.println("The total number of rounds is : "+result);
		input.close();
		
	}
	static int getNumberOfRounds(double sideOne, double sideTwo, double sideThree){
		double perimeterOfTriangle = sideOne+sideTwo+sideThree;
		int needToCover = 5000;
		int rounds = (int)(needToCover/perimeterOfTriangle);
		return rounds;
		
	}
	
}