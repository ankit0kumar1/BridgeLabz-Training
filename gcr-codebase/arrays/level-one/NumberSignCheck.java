import java.util.Scanner;
public class NumberSignCheck{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		int number [] = new int [5];
		
		//get numbers from the user using for loop 
		for(int index = 0 ; index < number.length; index++ ) {
			System.out.print("Enter a number " + (index+1) + ": ");
			number[index] = input.nextInt();
		}
		//traversing the array
		for(int index = 0 ; index < number.length; index++ ) {
		
			//Checking the number is +ve or -ve or zero
			if(number[index]<0){
				System.out.println(number[index] + " is Negative.");
			}else if(number[index]== 0){
				System.out.println("Zero.");
			}else{
			
				//checking the number is even or odd.
				if(number[index]%2 ==0){
					System.out.println(number[index] + " is positve even number.");
				}else{
					System.out.println(number[index] + " is positve odd number.");
				}
			}
			
		}
		if(number[0]>number[1]){
			System.out.println("First is greater than last.");
		}else if(number[0]<number[1]){
			System.out.println("First is lesser than last.");
		}else{
			System.out.println("First and last is equal.");
		}
		
		input.close();
		
	}
}