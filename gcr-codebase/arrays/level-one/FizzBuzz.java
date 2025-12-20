import java.util.*;
public class FizzBuzz{
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);
	
	// Taking input form the user.
	System.out.print("Enter a number: ");
	int number = input.nextInt();
	
	String array []  = new String[number+1];
	int index =0;
	
	if(number<0){
		System.out.println("Invalid Input.");
		
	}else{
		for(int i =0; i <= number; i++){
			if(i%3==0 && i%5== 0){
				array[index++]= "FizzBuzz";
			}else if(i%5==0){
				array[index++]= "Buzz";
			}else if(i%3==0 ){
				array[index++]= "Fizz";
			}else{
				array[index++] = Integer.toString(i);
			}
		}
		for(int i =0; i< index; i++){
			System.out.println(array[i]);
		}
	}
	
	input.close();
	}
}