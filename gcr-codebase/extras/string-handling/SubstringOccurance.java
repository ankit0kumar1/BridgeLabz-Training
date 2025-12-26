import java.util.*;
public class SubstringOccurance{

	//method to find the  occurance of a particular substring
	public static int countOccurance(String text, String subtext){
		int length = subtext.length();
		int start;
		int count =0;
		int end ;
		for (start =0; start < text.length()-subtext.length(); start++){
		
			end = start+length;
			if(text.substring(start,end).equals(subtext)){
				count++;
			}
		}
		return count;
	}

	//main method 
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		
		//taking input from the user.
		System.out.print("Enter a text : ");
		String text = input.nextLine();
		
		System.out.print("Enter the substring that you want to occurance of: ");
		String subtext = input.next();
		
		System.out.println("The number of occurance is : " + countOccurance(text,subtext));
		
		
		input.close();
	}
}