import java.util.Scanner; 
public class DoubleOperation{
	public static void main(String [] args){
		Scanner input = new Scanner (System.in);
		
		double a , b , c;
		//Taking input form the user 
		System.out.print("Enter first number: ");
		a = input.nextDouble();
		System.out.print("Enter second number: ");
		b = input.nextDouble();
		System.out.print("Enter third number: ");
		c = input.nextDouble();
		
		//Calculation
		double operation1 =  a + b *c;
		double operation2 = a * b + c;
		double operation3 = c + a / b;
		double operation4 = a % b + c;
		
		//Displaying the output 
		System.out.print("The results of Int Operations are " + operation1 + ", " + operation2 + "," + operation3 + " and " + operation4);
		
		input.close(); //closing the scanner object.
	}
}