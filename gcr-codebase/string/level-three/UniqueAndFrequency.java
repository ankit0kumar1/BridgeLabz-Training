import java.util.Scanner;
public class UniqueAndFrequency{
	//method that find non-repeating character and display
	public static void findNonRepeatingAndDisplay(String text){
		int[] frequency = new int[256];
		for(int index = 0 ; index < text.length() ; index++){
			int ch = text.charAt(index);
			frequency[ch]++;
		}
		String [][] wordAndFrequency = new String[256][2];
		for(int index = 0 ; index < frequency.length ; index++){
			if(frequency[index] == 1){
				char ch = (char)index;
				wordAndFrequency[index][0] = Character.toString(ch);
				wordAndFrequency[index][1] = Integer.toString(frequency[index]);
			}
		}
		System.out.println("char");
		for(int index = 0 ; index < frequency.length ; index++){
			if(wordAndFrequency[index][1] != null && wordAndFrequency[index][1].equals("1")){
				System.out.println(wordAndFrequency[index][0] + " \t "+
									wordAndFrequency[index][1]);
			}
		}
	}
	public static void main(String [] args){
		
		//create scanner object
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the text. ");
		String text = input.nextLine();
		findNonRepeatingAndDisplay(text);
		input.close();
	}
}