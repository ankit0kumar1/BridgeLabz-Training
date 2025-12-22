import java.util.*;
public class NumberCheckerOne{
	// method to find Count of digits in the number.
	public static int findCount(int number){
		int count =0;
		while(number!=0){
			number/=10;
			count++;
		}
		return count;
	}
	
	//method to store the digits of the number in array
	public static int[] storeDigits (int number ){
		int count = findCount(number);
		int [] digits = new int[count];
		int index =0;
		while(number!=0){
			digits[index++]= number%10;
			number/=10;
			
		}
		return digits;
	}
	//method to check duck number
	public static boolean checkDuckNumber(int[] digits) {

		for (int digit : digits) {
			if (digit != 0) {
				return true;   
			}
		}
		return false;          
	}

	
	//method to check armstrong number
	public static boolean isArmstrongNumber(int number){
		int [] digits = storeDigits(number);
		int sum =0;
		for(int digit : digits){
			sum+= Math.pow(digit,digits.length);
		}
		return sum==number;
	}
	//Method to find largest and second largest elements 
	public static int []findLargestSecondLargest (int [] digits){
		int [] largestSecondLargest =  new int[2];
		largestSecondLargest [0] = Integer.MIN_VALUE;
		largestSecondLargest [1] = Integer.MIN_VALUE;
		for(int digit: digits){
			if(digit>largestSecondLargest[0]){
				largestSecondLargest[1] = largestSecondLargest[0]; 
				largestSecondLargest[0]= digit;
			}else if(digit>largestSecondLargest[1]){
				largestSecondLargest[1]=digit;
			}
		}
		return largestSecondLargest;
	}
	
	//Method to find smallest and second smallest
	public static int [] findSmallestSecondSmallest(int [] digits){
		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;
			for(int digit: digits){
			if(digit<smallest){
				secondSmallest = smallest;
				smallest = digit;
			}else if(digit<secondSmallest){
				secondSmallest=digit;
			}
		}
		return new int[]{smallest,secondSmallest};
	}
	

	//main method
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
		//Take input
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		
		//count digit
		System.out.println("Total digits: " + findCount(number));
		
		int [] digits = storeDigits(number);
		
		//Check Duck Number
		System.out.println("Is duck number: " + checkDuckNumber(digits));
		
		//Check Armstrong
		System.out.println("Is Armstrong number: " + isArmstrongNumber(number));
		
		//Find largest and second largest

		int [] largestAndSecondLargest = findLargestSecondLargest(digits);
		System.out.println("Largest digit: " + largestAndSecondLargest[0]);
		System.out.println("Second Largest digit: " + largestAndSecondLargest[1]);
		
		//Find smallest and second smallest
		int [] smallestAndSecondSmallest = findSmallestSecondSmallest(digits);
		System.out.println("Smallest digit: " + smallestAndSecondSmallest[0]);
		System.out.println("Second Smallest digit: " + smallestAndSecondSmallest[1]);
		
		input.close();
		
	}
}