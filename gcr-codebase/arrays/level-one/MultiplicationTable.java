import java.util.*;
public class MultiplicationTable {
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
		//Taking user input 
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		
		int multiplicationTable [] = new int [10];
		
		//storing the values in the array
		for(int index = 0; index <10; index++){
			multiplicationTable[index] = number*(index+1);
		}
		
		//displaying the multiplicationTable
		for(int index = 0; index <10; index++){
			System.out.println(number + " * " + (index+1) + "= " +multiplicationTable[index]);
		}
		input.close();
		
	}
}