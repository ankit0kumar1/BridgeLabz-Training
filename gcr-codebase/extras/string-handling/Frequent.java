import java.util.Scanner;
public class Frequent{
	public static char findMostFrequentCharacter(String string){
		int[] freq = new int[256];
		for(char ch : string.toCharArray()){
			freq[(int)(ch)]++;
		}
		int max = Integer.MIN_VALUE;
		char result = string.charAt(0);
		for(int index = 0 ; index < freq.length ; index++){
			if(max < freq[index]){
				max = freq[index];
				result = (char)(index);
			}
		}
		return result;
	}
	public static void main(String [] args){
		
		//create object of scanner 
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the text. ");
		String word = input.next();
		char result = findMostFrequentCharacter(word);
		
		//display result.
		System.out.println("The most frequent character is: "+result);
		input.close();
		
	}
}