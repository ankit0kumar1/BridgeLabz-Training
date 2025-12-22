import java.util.*;
public class IllegalArgumentExceptionDemo{
	// Method to generate
	public static void generateException(String text){
		System.out.println(text.substring(text.length(),text.length()-1));
	}
	public static void handleException(String text){
		try{
			System.out.println(text.substring(text.length(),text.length()-1));
		}catch(StringIndexOutOfBoundsException e){
			System.out.println("StringIndexOutOfBoundsException caught and handled!");
		}
	}
	
	//main method 
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
		//Take input form the user
		System.out.print("Enter a text : ");
		String text = input.next();
		
		// 1. Calling method that generates exception
        System.out.println("Generating NullPointerException:");
       // generateException(text);

        // 2. Refactored code – handling the exception
        System.out.println("\nHandling NullPointerException:");
        handleException(text);
		
		input.close();
	}
}