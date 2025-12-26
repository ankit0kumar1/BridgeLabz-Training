import java.util.*;
public class ToggleCase{
	public static String dotoggleCase(String text){
		String toggle = "";
		for(int i =0; i < text.length(); i++){
			char ch ;
			if((int)text.charAt(i) >=97 && (int)text.charAt(i)<=112){
				 ch = (char)((int)text.charAt(i)-32);
				toggle += ch;
			}else{
				 ch =(char)((int)text.charAt(i)+32);
				toggle += ch;	
			}
		}
		return toggle;
	}


	public static void main(String [] args ){
	
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a text : ");
		String text = input.nextLine();
		
		
		System.out.print("Toggled string is : "+ dotoggleCase(text));
		
		
		input.close();
	}
}