import java.util.*;
public class StringLength{
	public static int getLength(String text){
		int count =0;
		int index =0;
		try{
			
			while(true){
				text.charAt(index++);
				count++;
				
			}
		}catch (StringIndexOutOfBoundsException e) {
			//
		}
		
		return count;
	}

	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
		//Taking input from the user
		System.out.print("Enter text: ");
		String text = input.next();
		
		int length = getLength(text);
		//display result
		System.out.println("result using user-defined method: " +length );
		System.out.println("The user-defined and built-in length() method displays the same result ?"+(length ==text.length()));
		
		
	}
}