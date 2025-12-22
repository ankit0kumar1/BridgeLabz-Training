import java.util.*;
public class StringIndexOutOfBoundsExceptionDemo{

	//Method to generate exception 
	public static void generateException(String text){
		
        System.out.println(text.charAt(text.length())); // Exception occurs here
	}
	// method to demostrate  StringIndexOutOfBoundsException
	public static void handleException(String text){
		try{
			System.out.println(text.charAt(text.length()));
		}catch(StringIndexOutOfBoundsException e){
			System.out.println("StringIndexOutOfBoundsException caught and handled!");
		}
	}
	
	
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
		//Take input form the user
		System.out.print("Enter a text : ");
		String text = input.next();
		
		// 1. Calling method that generates exception
        System.out.println("Generating StringIndexOutOfBoundsExceptionDemo:");
       // generateException(text);

        // 2. Refactored code – handling the exception
        System.out.println("\nHandling StringIndexOutOfBoundsExceptionDemo:");
        handleException(text);
		
	}
}