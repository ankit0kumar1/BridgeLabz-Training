import java.util.Scanner;
public class Trignometry{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the angle in degree: ");
		double angle = input.nextDouble();
		
		//Create object to call method
		Trignometry obj = new Trignometry();
		double [] result = obj.calculateTrignometricFunctions(angle);
		
		// display output
		System.out.println("Sine: "+result[0]);
		System.out.println("Cosine: "+result[1]);
		System.out.println("Tangent: "+result[2]);
		input.close();
		
	}
	public double[] calculateTrignometricFunctions(double angle){
		double radians = Math.toRadians(angle);
		double sine = Math.sin(radians);
		double cosine = Math.cos(radians);
		double tangent = Math.tan(radians);
		return new double[] {sine,cosine,tangent};
	}
}	