import java.util.*;
public class NumberFormatExceptionDemo{
	// Method to generate NumberFormatException
	public static void generateException(String text){
		System.out.println(Integer.parseInt(text));
	}
	public static void handleException(String text){
		try{
			System.out.println(Integer.parseInt(text));
		}catch(NumberFormatException e){
			System.out.println("NumberFormatException caught and handled!");
		}
	}
	
	//main method 
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
		//Take input form the user
		System.out.print("Enter a text : ");
		String text = input.next();
		
		// 1. Calling method that generates exception
        System.out.println("Generating NumberFormatException:");
		//generateException(text);

        // 2. Refactored code – handling the exception
        System.out.println("\nHandling NumberFormatException:");
       // handleException(text);
		
		input.close();
	}
}