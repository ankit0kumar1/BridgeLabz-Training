//Program to find largest and second largest digit in a number increased version.
import java.util.*;
public class LargestAndSecondLargestTwo{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
		//Taking input form the user
		System.out.print("Enter a number: ");
        int number = input.nextInt();
		
		int maxDigit = 10;
		int digit[] = new int[maxDigit];
		int index =0;
		
		while(number!=0 ){
			if(index == maxDigit){
				maxDigit += 10;
				int temp[] = new int[maxDigit];
				for(int i =0; i< digit.length; i++){
					temp[i]= digit[i];
				}
				digit =temp;
			}else{
				digit[index++]= number%10;
				number /=10;
			}
		}
		
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		//Find largest and second largest Digit
		for(int i = 0 ; i<digit.length; i++){
			if(largest<digit[i]){
				secondLargest = largest;
				largest = digit[i];
				
			}else if(digit[i]>secondLargest && secondLargest!= largest){
				secondLargest = digit[i];
			}
			
		}
		
		 // Displaying the result
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);
		
		input.close();
	}
}