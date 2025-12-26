import java.util.Scanner;
public class Replace{
	public static String removeAndAdd(String string , char remove , char insert){
		String word = "";
		for(int index = 0 ; index < string.length() ; index++){
			if(string.charAt(index) == remove){
				word += Character.toString(insert);
				continue;
			}
			word += string.charAt(index);
		}
		return word;
	}
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String string = input.next();
		System.out.println("Enter the character that you want to remove: ");
		char removeChar = input.next().charAt(0);
		System.out.println("Enter what character you want: ");
		char insertChar = input.next().charAt(0);
		
		String result = removeAndAdd(string , removeChar , insertChar);
		System.out.println("Modified String is: "+result);
	}
}