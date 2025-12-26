import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class DateArthematic{
	public static void main(String [] args){
		Scanner input = new Scanner (System.in);
		System.out.print("Enter the date in yyyy-MM-dd format: " );
		String date = input.next();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate myDate = LocalDate.parse(date,formatter);
		
		myDate = myDate.plusDays(7);
		System.out.println(myDate + " 7days+");
		myDate = myDate.plusMonths(1);
		System.out.println(myDate + " 1month+");
		myDate = myDate.plusYears(2);
		System.out.println(myDate + " 2years+");
		myDate =myDate.minusWeeks(3);
		System.out.println(myDate + " 3week-");
		
		System.out.println("Final date: " + myDate);
	}
	
	
}