import java.util.*;
public class NumberSignChecker{
	public static void main(String [] args){
		Scanner input = new Scanner (System.in);
		
		//Taking input form the user 
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		
		int sign = getSign(number);
		if(sign==0){
			System.out.println("Zero");
		}else if(sign > 0){
			System.out.println("Positive");
		}else{
			System.out.println("Negative");
		}
		
		input.close();
	}
	static int getSign(int number){
		//checking whether the number is positive , negative or zero
		if( number == 0){
			return 0;
		}
		else if(number > 0){
			return 1;
		}else{
			return -1;
		}
		
	}
	
}