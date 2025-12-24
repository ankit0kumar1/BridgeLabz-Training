import java.util.Scanner;
public class CalendarDisplay {
    //methodthat check Leap Year
    static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }
    //methodt to get number of days in a month
    static int getDaysInMonth(int month, int year) {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return days[month - 1];
    }
    // method to get month name
    static String getMonthName(int month) {
        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        return months[month - 1];
    }
    // method to get first day of the month..
    static int getFirstDay(int month, int year) {
        int d = 1;
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;
        return d0;
    }
    public static void main(String[] args) {
		
		//create scanner object
        Scanner input = new Scanner(System.in);
        System.out.print("Enter month: ");
        int month = input.nextInt();
		System.out.print("Enter the year: ");
        int year = input.nextInt();
        System.out.println("\n     " + getMonthName(month) + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        int firstDay = getFirstDay(month, year);
        int daysInMonth = getDaysInMonth(month, year);
		
		//display result
        //loop:= indentation before day one
        for (int i = 0; i < firstDay; i++) {
            System.out.printf("%4s", "");
        }
        //loop:- print days
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%4d", day);
            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
        input.close();
    }
}