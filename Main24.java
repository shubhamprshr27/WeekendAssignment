/**
 * 
 */
package weekendAssignment;

/**
 * @author shparashar
 *
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

class UserMainCode24 {
	
	public static int getLastDayOfMonth(String date) {
		int year, month, day;
		int i1 = date.indexOf('-');
		int i2 = date.lastIndexOf('-');
		day = Integer.parseInt(date.substring(0, i1));
		month = Integer.parseInt(date.substring(i1+1, i2));
		year = Integer.parseInt(date.substring(i2+1));
		Calendar mycal = new GregorianCalendar(year, month-1, day);
		int daysInMonth = mycal.getActualMaximum(Calendar.DAY_OF_MONTH); 
		return daysInMonth;
	}
}

public class Main24 {
	public static void main(String[] args) {
		System.out.println("Enter date (DD-MM-YYYY):");
		Scanner in = new Scanner(System.in);
		String date = in.next();
		System.out.println(UserMainCode24.getLastDayOfMonth(date));
		in.close();
	}
}