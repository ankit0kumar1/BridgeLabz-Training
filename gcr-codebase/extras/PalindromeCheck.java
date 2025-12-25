import java.util.*;
public class PalindromeCheck{


	//method to reverse a string
	public static String reverse(String text){
		StringBuilder sb= new StringBuilder();
		int index = text.length()-1;
		while(index!=-1){
			sb.append(text.charAt(index--));
			
		}
		return sb.toString();
	}
	
	//main method
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a text: ");
		String text = input.next();
		String reverse = reverse(text);
		if(text.equals(reverse)){
			System.out.println("Palindrome");
		}else{
			System.out.println("Not Palindrome");
		}
		
		input.close();
	}
}