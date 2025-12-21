import java.util.*;
public class Voter{
	
	//Method to check if a student can vote.
	public static boolean canStudenVote(int age){
		//check elegiblity
		if(age>=18){
			return true;
		}else{
			return false;
		}
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int [] age = new int[10];
		
		//Take input 
		for(int i =0 ; i<10; i++){
			System.out.print("Enter the age of the student: ");
			age[i] = input.nextInt();
		}
		//display output
		for(int i =0 ; i<10; i++){
			boolean value = canStudenVote(age[i]);
			if(value){
				System.out.println("Can vote and age is :" + age[i]);
			}else{
				System.out.println("Cannot vote and age is :" + age[i]);
			}
		}
		
		
		
		
		input.close();
	}
}