import java.util.*;
public class VowelsAndConsonants{
	
	//method to check if the character is vowel or consonant
	public static String checkCharacter (char ch){
		if (ch >= 'a' && ch <= 'z'){
			if(ch == 'a' || ch=='e' || ch == 'i' || ch == 'o' || ch =='u'){
				return "Vowel";
			}else{
				return "Consonant"; 
			}
					
		}else{
			return "Not a Letter";
		}
	}
	
	//method to convert it in lowercase if in Uppercase 
	public static String convertToLowerCase(String text){
		int length = text.length();
		String lowerCase = "";
		for(int i =0; i < length; i++){
			if((int)text.charAt(i) < 97){
				lowerCase +=(char)((int)text.charAt(i)+32);
			}else{
				lowerCase += text.charAt(i);
			}
		}
		return lowerCase;
	}
	
	//Method to find vowel and consonant or not a letter.
	public static int[] countOfVowelsAndConsonant (String text){
		String lowerCaseText = convertToLowerCase(text);
		int countVowel=0;
		int countConsonant=0;
		for(int i =0; i < text.length(); i++){
			char ch = lowerCaseText.charAt(i);
			if(checkCharacter(ch).equals("Vowel")){
				countVowel++;
			}else{
				countConsonant++;
			}
		}
		return new int []{countVowel, countConsonant};
	}
	
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		
		//Take input
		System.out.print("Enter a text: ");
		String text = input.nextLine();
		
		int[] countOfVowelsAndConsonant= countOfVowelsAndConsonant(text);
		System.out.println("VOWELS COUNT IS: " + countOfVowelsAndConsonant[0] + "\nCONSONANTS COUNT IS : "+ countOfVowelsAndConsonant[1]);
		
		
	}
}