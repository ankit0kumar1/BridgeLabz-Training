import java.util.*;
public class SubString{
	//method to create substring
	public static String createSubstring(String one , int startIndex, int endIndex){
		String substring = "";
		for(int i = startIndex; i<endIndex; i++){
			substring +=one.charAt(i);
		}
		return substring;
	}
	
	//Method to compare two strings using charAt().
	public static boolean compare(String substringOne, String substringTwo){
		if(substringOne.length()!=substringTwo.length()){
			return false;
		
		}else{
			for(int i =0 ; i< substringOne.length(); i++){
				if(substringOne.charAt(i)!=substringTwo.charAt(i)){
				return false;
				
				}
			}
			return true;
		}
	}
	
	
	//main method
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
		//Take input
		System.out.print("Enter a string: ");
		String one = input.next();
		
		//taking index as input 
		System.out.print("Enter start index for substring: ");
		int startIndex = input.nextInt();
		System.out.print("Enter end index for substring: ");
		int endIndex = input.nextInt();
		
		//using-charAt() method
		String substringOne = createSubstring(one, startIndex,endIndex);
		
		//built-in substring method 
		String substringTwo = one.substring(startIndex, endIndex);
		
		//display built-in substring and using-charAt substring
		System.out.println("Using Built-in method : " + substringTwo + "\nUsing charAt() : " + substringTwo );
		
		//check both substring are same or not
		System.out.println("Is built-in substring() method and using-charAt() gives same substring : " +compare(substringOne,substringTwo));
		
		
		
		
		input.close();
	}
}