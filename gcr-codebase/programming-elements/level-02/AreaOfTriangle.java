import java.util.Scanner;
public class AreaOfTriangle{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
		//Taking input from the user.
		System.out.print("Enter the base of the triangle in cm: ");
		double base = input.nextDouble();
		System.out.print("Enter the height of the triangle in cm: ");
		double height = input.nextDouble();
		
		//Finding the area of the triangle.
		double areaInCentimeters = 0.5*base*height;
		double areaInInches = 0.5*(base/2.54)*(height/2.54);
		
		//Displaying the area of triangle.
		System.out.println("The Area of the triangle in sq in is " + areaInInches + " and sq cm is " +areaInCentimeters);
		
		input.close();//closing Scanner object.
	}
}