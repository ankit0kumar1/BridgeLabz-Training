import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DifferentTimeZone{
	public static void main(String [] args){
	
		//Formatter for readable output 
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss z");
		//GMT
		ZonedDateTime gmtTime = ZonedDateTime.now(ZoneId.of("GMT"));
		System.out.println("GMT Time : " + gmtTime.format(formatter));
		
		//IST (Indian Standard Time)
		ZonedDateTime istTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
		System.out.println("IST Time : " + istTime.format(formatter));
		
		//PST (Pacific Standard Time)
		ZonedDateTime pstTime = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
		System.out.println("PST Time : " + pstTime.format(formatter));

		
		
	}
}