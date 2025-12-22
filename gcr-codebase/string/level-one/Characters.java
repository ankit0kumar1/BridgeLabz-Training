import java.util.*;
public class Characters{
	//method to return characters in string
	public static char [] characters(String one){
		char [] characters = new char[one.length()];
		for(int i =0 ; i < one.length(); i++){
			characters[i] = one.charAt(i);
		}
		return characters;
	}
	
	//method to compare two char array and return boolean result
	public static boolean compare(char [] array1 , char [] array2){
		for(int i =0; i < array1.length; i++){
			if(array1[i]!=array2[i]){
				
				return false;
			}
			
		}return true;
		
	}

	//main method
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
		//take input
		System.out.print("Enter a string: ");
		String one = input.next();
		
		char array1[] = characters(one);
		char array2[] = one.toCharArray();
		//display output
		System.out.println("Return all characters without using toCharArray(): " + Arrays.toString(characters(one)));
		System.out.println("Results of both methods are same : " +compare(array1,array2));
		
		input.close();
	}
}