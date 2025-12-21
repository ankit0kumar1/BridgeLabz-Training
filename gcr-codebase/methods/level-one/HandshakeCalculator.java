import java.util.*;
public class HandshakeCalculator{
	public static void main(String [] args){
		Scanner input = new Scanner (System.in);
		
		//Get number of Students from the user.
		System.out.print("Enter the number of Students: ");
		int numberOfStudents = input.nextInt();
		
		getNumberOfHandshake(numberOfStudents);
		
		input.close();
	}
	//Method to calculate the number of Handshake.
	static void getNumberOfHandshake(int numberOfStudents){
		int numberOfHandshake = (numberOfStudents*(numberOfStudents-1))/2;
		System.out.println("The number of total number of handshake: "+ numberOfHandshake);
	}
}