// Create Handshakes Class to compute the number of handshakes
import java.util.Scanner;
public class Handshakes{
	public static void main(String[] args){
		
		// Create the Scanner object and taking the number of students from the user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of Student");
		int numberOfStudents = input.nextInt();
		double numberOfHandshakes = (double)((numberOfStudents * (numberOfStudents - 1)) / 2);
		
		//Print the number of handshakes
		System.out.println("The number of possible handshakes is " +numberOfHandshakes);
		input.close();
	}

	
}