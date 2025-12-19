import java.util.*;
public class OddAndEven{
	public static void main(String [] args){
		Scanner input = new Scanner (System.in);
		
		//Taking input form the user 
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		
		//Checking the user input is natural number.
		if(number <= 0){
			System.out.println("Invalid number entered by the user.");
		}else{
		
			int size = (number/2)+1;
			int even [] = new int [size];
			int odd [] = new int [size];
			int oddIndex =0;
			int evenIndex =0;
			
			//for loop to store odd and even number in arrays
			for(int i =1 ; i <=number ; i++){
				if(i%2==0){
					even[evenIndex] =i;
					evenIndex++;
				}else{
					odd[oddIndex] =i;
					oddIndex++;
				}
			}
			//displaying odd array
			System.out.print("Odd Array: ");
			for(int index =0; index <oddIndex ; index++){
				System.out.print(odd[index] + " ");
			}
			System.out.println();
			//displaying even array
			System.out.print("Even Array: ");
			for(int index =0; index <evenIndex ; index++){
				System.out.print(even[index] + " ");
			}
			
		}
		
		
		
		input.close();
	}
}