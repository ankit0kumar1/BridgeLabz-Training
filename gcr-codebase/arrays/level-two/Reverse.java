//Program to take a number as input and reverse the number.
import java.util.*;
public class Reverse{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
		//Taking input from the user
		System.out.print("Enter a number: ");
		int number = input.nextInt();
	
		//count digits in the number
		int count =0;
		int temp = number;
		while(temp!=0){
			temp /=10;
			count++;
		}
		
		
		
		int digits[] = new int[count];
		
		// Store digits in reverse
		int index =0;
        while (number != 0) {
            digits[index++] = number % 10;
            number = number / 10;

        }
		
		for(int i =0; i < digits.length; i++){
			System.out.print(digits[i]);
		}
		

		
		input.close();
		
	}
}