import java.util.*;
public class UpperCaseAndCompare{
	public static String convertToUpperCase(String text){
		int length = text.length();
		String upperCase = "";
		for(int i =0; i < length; i++){
			if((int)text.charAt(i) >= 97){
				upperCase +=(char)((int)text.charAt(i)-32);
			}else{
				upperCase += text.charAt(i);
			}
		}
		return upperCase;
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
		
		System.out.println("UpperCase : " + convertToUpperCase(text));
		String builtInUpperCase = text.toUpperCase();
		String charUppercase= convertToUpperCase(text);
		System.out.println("Does both method gives same result : "+ compare(charUppercase,builtInUpperCase));
		
		input.close();
	}
}