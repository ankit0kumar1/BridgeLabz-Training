import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateComparision{
	public static void main(String [] args){
		Scanner input = new Scanner (System.in);
		
		//taking input
		System.out.print("Enter the date in yyyy-MM-dd format: " );
		String date1 = input.next();
		System.out.print("Enter the date in yyyy-MM-dd format: " );
		String date2 = input.next();
		//convert string to date
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate myDate1 = LocalDate.parse(date1,formatter);
		LocalDate myDate2 = LocalDate.parse(date2,formatter);
		//display comparision
		if (myDate1.isBefore(myDate2)) {
			System.out.println("First date is before the second date.");
		} else if (myDate1.isAfter(myDate2)) {
			System.out.println("First date is after the second date.");
		} else {
			System.out.println("Both dates are the same.");
		}

		input.close();
		
		
	}
}