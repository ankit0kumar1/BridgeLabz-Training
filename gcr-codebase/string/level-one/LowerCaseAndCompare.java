import java.util.*;
public class LowerCaseAndCompare{
	public static String convertToLowerCase(String text){
		int length = text.length();
		String lowerCase = "";
		for(int i =0; i < length; i++){
			if((int)text.charAt(i) < 97){
				lowerCase +=(char)((int)text.charAt(i)+32);
			}else{
				lowerCase += text.charAt(i);
			}
		}
		return lowerCase;
	}
	
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
	
	public static void main(String [] args){
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter the text: ");
		String text = input.nextLine();
		
		System.out.println("LowerCase : " + convertToLowerCase(text));
		String builtInLowerCase = text.toLowerCase();
		String charLowercase= convertToLowerCase(text);
		System.out.println("Does both method gives same result : "+ compare(charLowercase,builtInLowerCase));
		
		input.close();
	}
}