/*
15. Rohan’s Library Reminder App 📚
Rohan wants a fine calculator:
● Input return date and due date.
● If returned late, calculate fine: ₹5/day.
● Repeat for 5 books using for-loop.

*/
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
public class LibraryReminderApp{
	public static void main(String [] args){
		Scanner input = new Scanner (System.in);
		
		int finePerDay =5;
		
		System.out.println("Library Fine Calculator: ");
		for(int i =1; i<=5 ; i++){
			System.out.println("Book " +i);
			System.out.println("Enter issue date(yyyy-MM-dd): ");
			LocalDate issueDate = LocalDate.parse(input.nextLine());
			
			LocalDate dueDate = issueDate.plusDays(7);
			System.out.println("Due date is : " + dueDate);
			
			System.out.println("Enter return date (yyyy-MM-dd): ");
			LocalDate returnDate = LocalDate.parse(input.nextLine());
			
			
			if(returnDate.isAfter(dueDate)){
				long lateDays = ChronoUnit.DAYS.between(dueDate , returnDate);
				int fine = (int)lateDays*finePerDay;
				System.out.println("Late by " + lateDays + " days");
                System.out.println("Fine: " + fine);
			} else {
                System.out.println("Book returned on time. No fine.");
            }
			System.out.println("---------------------");
			
		}
		input.close();
	}
}