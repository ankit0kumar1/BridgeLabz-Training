import java.util.Scanner;
public class Palindrome{
	public static boolean findPalindrome(String text){
		int start = 0;
		int end = text.length()-1;
		while(start < end){
			if(text.charAt(start) != text.charAt(end)){
				return false;
			}
			start++;
			end--;
		}
		return true; 
	}
	public static void main(String [] args){
		
		//create the object of scanner
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String text = input.next();
		boolean result = findPalindrome(text);
		
		//result println
		if(result){
			System.out.println("Yes, the text is palindrome");
		}
		else{
			System.out.println("No, the text is not palindrome");
		}
		input.close();
		
	}
}