import java.util.*;
public class LongestWord{
	
	public static String [] stringArray(String text){
		int [] spacesIndex = spacesIndex(text);
		int numberOfWords =countSpaces(text)+1;
		String [] stringArray = new String[numberOfWords];
		int start =0;
		for(int i =0; i < spacesIndex.length; i++){
			int end = spacesIndex[i];
			stringArray[i] = text.substring(start,end);
			start = end+1;
			
		}
		stringArray[numberOfWords-1]= text.substring(start);
		
		return stringArray;
	}
	
	public static String longestWord(String[] stringArray){
		String longest = "";
		for(int i =0; i < stringArray.length; i++){
			if(longest.length()<(stringArray[i].toString()).length()){
				longest= stringArray[i];
			}
		}
		return longest;
	}
	
	
	
	public static int countSpaces(String text){
		int countSpaces =0;
		for(int i =0; i < text.length() ; i++){
			if(text.charAt(i)==' ') countSpaces++;
		}
		return countSpaces;
	}
	
	public static int[] spacesIndex(String text){
		int[] spacesIndex = new int [countSpaces(text)];
		int j =0;
		for(int i =0; i < text.length() ; i++){
			if(text.charAt(i)==' ') spacesIndex[j++]=i;
		}
		return spacesIndex;
	}
	
	
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a text: ");
		String text = input.nextLine();
		
		String [] stringArray= stringArray(text);
		System.out.println("The longest word in the given text is : " + longestWord(stringArray));
	}
}
