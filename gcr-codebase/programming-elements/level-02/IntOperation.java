import java.util.Scanner; 
public class IntOperation{
	public static void main(String [] args){
		Scanner input = new Scanner (System.in);
		
		int a , b , c;
		//Taking input form the user 
		System.out.print("Enter first number: ");
		a = input.nextInt();
		System.out.print("Enter second number: ");
		b = input.nextInt();
		System.out.print("Enter third number: ");
		c = input.nextInt();
		
		//Calculation
		int operation1 =  a + b *c;
		int operation2 = a * b + c;
		int operation3 = c + a / b;
		int operation4 = a % b + c;
		
		//Displaying the output 
		System.out.print("The results of Int Operations are " + operation1 + ", " + operation2 + "," + operation3 + " and " + operation4);
		
		input.close(); //closing the scanner object.
	}
}