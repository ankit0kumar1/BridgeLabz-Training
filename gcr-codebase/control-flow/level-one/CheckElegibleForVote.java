import java.util.*;
public class CheckElegibleForVote{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
		//get age form the user
		System.out.print("Enter the age of the person: ");
        int age = input.nextInt();
		
		// Checking voting eligibility
        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }
		
		input.close();
		
		

	}
}