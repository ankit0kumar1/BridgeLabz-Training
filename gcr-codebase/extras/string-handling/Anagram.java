import java.util.Scanner;
public class Anagram{
	// method that check anagram 
	public static boolean findAnagrams(String stringOne, String stringTwo){
		if(stringOne.length() != stringTwo.length()){
			return false;
		}
		int[] frequency = new int[256];
		//finding frequency and increasing the count
		for(char ch : stringOne.toCharArray()){
			frequency[(int)ch]++;
		}
		//finding frequency and decreasing the count
		for(char ch : stringTwo.toCharArray()){
			frequency[(int)ch]--;
		}
		//checking the frequency array
		for(int freq : frequency){
			if(freq != 0){
				return false;
			}
		}
		return true;
	}
	public static void main(String [] args){
	
		//create scanner object
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first text: ");
		String textOne = input.nextLine();
		System.out.println("enter the second text:");
		String textTwo = input.nextLine();
		//calling method for find the texts are anagrams or not
		boolean result = findAnagrams(textOne , textTwo);
		
		// print result
		if(result){
			System.out.println("Yes, the both text text are anagrams.");
		}
		else{
			System.out.println("No, the both the text are not anagrams.");
		}
		input.close();
	}
}