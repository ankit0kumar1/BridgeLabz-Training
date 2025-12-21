import java.util.*;
public class SpringSeason {
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		
		//Get day and month from the user.
		System.out.print("Enter the current date: ");
		int date = input.nextInt();
		System.out.print("Enter the current month in numbers: ");
		int month = input.nextInt();
		
		boolean status = checkSpringSeason(date, month);
		System.out.println("This is Spring season : " + status);
		
		input.close();
	}
	
	//Creating method to check it is Spring season or not.
	static boolean checkSpringSeason(int date, int month){
		if((date >=20 && month == 3) || 
		month == 4 ||
		month == 5 ||
		(date <=20 && month ==6)){
			return true;
		}else{
			return false;
		}
		
	}
}