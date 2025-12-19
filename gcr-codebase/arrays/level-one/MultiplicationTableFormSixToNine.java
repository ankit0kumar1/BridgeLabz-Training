import java.util.Scanner;
public class MultiplicationTableFormSixToNine {
	public static void main(String [] args ){
		Scanner input = new Scanner(System.in);
		
		//Taking the input from the user
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		
		int multiplicationTable[] = new int [4];
		
		int index =0;
		for(int i=6; i<=9; i++){
			multiplicationTable[index]= number*i;
			index++;
		}
		//Displaying the result
		for(int i =0; i<multiplicationTable.length; i++ ){
			System.out.println(number + " * " + (i+6) + " = " + multiplicationTable[i]);
		}
		
		input.close();
	}
}