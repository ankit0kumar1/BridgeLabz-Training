import java.util.*;

public class CheckVotingAge{
	public static void main (String [] args) {
		Scanner input = new Scanner (System.in);
		//declaring an array
		int age [] = new int [10];

		//initalizing an array by taking input from the user
		for(int index = 0; index < 10; index++) {
			System.out.print("Enter the age of student " + (index+1) + ": ");
			age[index] = input.nextInt();
		}
		
		
		for(int index = 0; index < age.length; index++){
		
		//checking the age of the students
			if(age[index]<0 ){
				System.out.println("Invalid age");
			}else if(age[index]>=18){
				System.out.println("The student with the age " + age[index] +" can vote.");
			}else{
				System.out.println("The student with the age " + age[index] +" cannot vote.");
			}
		}
		
		input.close();
		
	}
}