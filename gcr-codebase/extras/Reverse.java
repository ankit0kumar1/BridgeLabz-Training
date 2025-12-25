import java.util.*;
public class Reverse {
	//method to reverse a string
	public static String reverse(String text){
		StringBuilder sb= new StringBuilder();
		int index = text.length()-1;
		while(index!=-1){
			sb =sb.append(text.charAt(index--));
			
		}
		return sb.toString();
	}
	
	
	public static void main(String [] args){
		Scanner input = new Scanner (System.in);
		System.out.print("Enter a text: ");
		String text = input.next();
		String reverse = reverse(text);
		System.out.println(reverse);
		
		
		input.close();
	}
}