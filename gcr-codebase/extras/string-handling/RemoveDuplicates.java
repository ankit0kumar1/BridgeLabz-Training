import java.util.*;
public class RemoveDuplicates{
	//method to remove duplicate
	public static String removeDuplicate(String text){
		char[] ch = text.toCharArray();
		String rev = "";
		boolean [] seen = new boolean [26];
		for(int i =0; i < ch.length; i++){
			if(seen[(int)ch[i]-97]!=true ){
				rev += ch[i];
				seen[(int)ch[i]-97]=true;
			}
		}
		return rev;
		
	}
	//main method
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a text: ");
		String text = input.next();
		
		System.out.println("Text without duplicates : " + removeDuplicate(text));
		
		input.close();
	}
}