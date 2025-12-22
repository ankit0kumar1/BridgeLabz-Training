import java.util.*;
public class ArrayIndexOutOfBoundsExceptionDemo{
	// Method to generate ArrayIndexOutOfBoundsException
	public static void generateException(String [] names){
		System.out.println(names[names.length]);
	}
	public static void handleException(String [] names){
		try{
			System.out.println(names[names.length]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("ArrayIndexOutOfBoundsException caught and handled!");
		}
	}
	
	//main method 
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
		//Take input form the user
		System.out.print("Enter the size of array: ");
		int size = input.nextInt();
		String[] names = new String[size];
		
		for(int i = 0 ; i< size; i++){
			System.out.print("Enter your name : ");
			names[i] = input.next();
		}
		// 1. Calling method that generates exception
        System.out.println("Generating ArrayIndexOutOfBoundsException:");
		//generateException(names);

        // 2. Refactored code – handling the exception
        System.out.println("\nHandling ArrayIndexOutOfBoundsException:");
        handleException(names);
		
		input.close();
	}
}