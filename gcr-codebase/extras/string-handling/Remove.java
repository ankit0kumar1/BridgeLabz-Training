import java.util.Scanner;
public class Remove{
	public static String removeAllOccurrence(String string, char ch){
		String result = "";
		for(int index = 0 ; index < string.length() ; index++){
			if(ch == string.charAt(index)){
				continue;
			}
			result += string.charAt(index);
		}
		return result;
	}
	public static void main(String [] args){
		
		//create the scanner object
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String string = input.nextLine();
		System.out.println("Enter the character: ");
		char ch = input.next().charAt(0);
		String result = removeAllOccurrence(string , ch);
		
		//print the result
		System.out.println("Modified String: "+result);
		input.close();
		
	}
}