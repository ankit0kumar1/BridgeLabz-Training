import java.util.*;
public class Lexicographical{
	//method to comapare string lexographically
	public static int compareLexicographically(String stringOne, String stringTwo){
		int minLength ;
		if(stringOne.length() < stringTwo.length()){
			minLength = stringOne.length();
		}else{
			minLength = stringTwo.length();
		}
		for(int i =0 ; i < minLength; i++){
			if(stringOne.charAt(i)-stringTwo.charAt(i)<0){
				return -1;
				
			}else if(stringOne.charAt(i)-stringTwo.charAt(i)>0){
				return 1;
			
			}
		}	
		// If all characters are same, compare lengths
		if (stringOne.length() < stringTwo.length()) {
			return -1;
		} else if (stringOne.length() > stringTwo.length()) {
			return 1;
		}
		return 0;

	}
	
	//main method 
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a text : ");
		String textOne = input.next();
		System.out.print("Enter a text : ");
		String textTwo = input.next();
		
		if(compareLexicographically(textOne,textTwo)==-1){
			System.out.println(textOne + " comes before "+ textTwo + " in lexicographically order.");
		}else if(compareLexicographically(textOne,textTwo) == 1){
			System.out.println(textTwo + " comes before "+ textOne + " in lexicographically order.");
		}else{
			System.out.println("Both are equal in lexicographically order.");
		}
	}
	
}