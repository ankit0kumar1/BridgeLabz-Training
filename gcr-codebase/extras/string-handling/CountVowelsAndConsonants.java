import java.util.*;
public class CountVowelsAndConsonants{
	//method to count vowels 
	public static int countVowels(String text ){
		text = text.toLowerCase();
		int countVowels = 0;
		
		char ch ;
		for(int i =0 ; i < text.length() ; i++){
		 ch  = text.charAt(i);
			if( ch == 'a'|| ch == 'e' || ch == 'i' || ch =='o' || ch == 'u'){
				countVowels++;
			}
			
		}
		return countVowels;
		
	}
	
	
	//main method 
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a text: ");
		String text = input.next();
		System.out.println("Number of vowels: " + countVowels(text));
		System.out.println("Number of consonants: " + (text.length()-countVowels(text)));
		
		input.close();
	}
}