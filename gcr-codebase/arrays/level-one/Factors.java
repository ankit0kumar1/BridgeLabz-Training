import java.util.*;
public class Factors {
	public static void main(String [] args){
		Scanner input = new Scanner (System.in);
		
		//Taking input form the user 
		int number = input.nextInt();
		
		int maxFactor = 10;
		int factors [] = new int [maxFactor];
		int index =0;
		
		//Finding factors using loop 
		for (int i =1; i <= number; i++){
			if (index == maxFactor){
				maxFactor = 2*maxFactor;
				int temp [] = new int[maxFactor];
				//putting the value of factors array
				for(int j =0; j < factors.length; j++){
					temp[j]= factors[j];
				}
				factors =temp;
				
			}else if(number%i == 0){
				factors[index++] =i;
				
			}
			
		} 
		System.out.print(Arrays.toString(factors));
		
	}
}