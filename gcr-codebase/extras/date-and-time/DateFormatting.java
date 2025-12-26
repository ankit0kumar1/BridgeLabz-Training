import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateFormatting{
	public static void main(String [] args){
		LocalDate currentdate = LocalDate.now();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("In dd/MM/yyyy format : "+currentdate.format(formatter));
		
		formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		System.out.println("In yyyy-MM-dd format : "+currentdate.format(formatter));
		
		formatter = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");
		System.out.println("In EEE, MMM dd,yyyy format : "+currentdate.format(formatter));
		
	}
}