import java.util.Scanner;
public class NonRepeating{
	//method that find non-repeating character
	public static String findNonRepeating(String text){
		int[] frequency = new int[256];
		for(int index = 0 ; index < text.length() ; index++){
			int ch = text.charAt(index);
			frequency[ch]++;
		}
		String word = "";
		for(int index = 0 ; index < frequency.length ; index++){
			if(frequency[index] == 1){
				word += (char)(index);
			}
		}
		return word;
	}
	public static void main(String [] args){
		
		//create scanner object
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the text. ");
		String text = input.nextLine();
		String result = findNonRepeating(text);
		
		//print the result
		System.out.println(result);
		input.close();
	}
}