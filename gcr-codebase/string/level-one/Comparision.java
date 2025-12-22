import java.util.*;
public class Comparision{

	//Method to compare two strings using charAt().
	public static boolean compare(String one, String two){
		if(one.length()!=two.length()){
			return false;
		
		}else{
			for(int i =0 ; i< one.length(); i++){
				if(one.charAt(i)!=two.charAt(i)){
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
		System.out.print("Enter a string: ");
		String two = input.next();
		
		boolean result = compare(one, two);
		
		System.out.println("String one is equal to String two using charAt() : "+ result);
		System.out.println("Is built-in method result same to charAt() method: " + (result==one.equals(two)));
		
	}
	
	
	
}