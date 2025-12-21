import java.util.*;
public class SumOfNaturalNumbers{
	public static int findSumRecursive(int n){
		if(n ==1){
			return 1;
		} else{
			return n+findSumRecursive(n-1) ;
		}
		
	}
	public static int findSumFormula(int n){
		return n*(n+1)/2;
	}

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int number;
		while(true){
			System.out.print("Enter a number: ");
			number = input.nextInt();
			if(number<0){
				System.out.println("Enter a vaild number.");
			}else{
				break;
			}
		}
		//display sum using recursive function
		System.out.println("Sum of natural numbers using Recursive method: " + findSumRecursive( number));
		System.out.println("Sum of natural numbers using Formula: " + findSumFormula( number));
		System.out.println("Is the sum equal using the formula and recursive method? " + (findSumFormula(number)==findSumRecursive(number)));
		
		
		input.close();
	}
}