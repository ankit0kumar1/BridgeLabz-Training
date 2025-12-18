import java.util.*;
public class CheckNumberSign{
	public static void main(String [] args){
		Scanner input = new Scanner (System.in);
		
		//Taking input form the user 
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		
		//checking whether the number is positive , negative or zero
		if( number == 0){
		System.out.println("Zero");
		}
		else if(number > 0){
		System.out.println("Positive");
		}else{
		System.out.println("Negative");
		}
		
		
		input.close();
	}
}