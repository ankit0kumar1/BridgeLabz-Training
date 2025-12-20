import java.util.*;
public class FrequencyCounter{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
		//Taking input form the user
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		
		int temp= number;
		int count = 0;
		while(temp !=0){
			temp/=10;
			count++;
		}
		
		//Store values in array
		int digit[] = new int[count];
		int index =0;
		while(number !=0){
			digit[index]=number%10;
			number/=10;
			index++;
		}
		
		// Find frequency of the digits
		int frequency [] = new int[10];
		for(int i =0; i< digit.length; i++){
			
			frequency[digit[i]]++;
			
		}
		
		//Displaying the frequency of each digit in the number
		for(int i =0 ; i<10; i++){
			if(frequency[i]!=0){
				System.out.println("The frequency of digit " + i +" is: " + frequency[i]);
			}
		}
		
		input.close();
	}
}