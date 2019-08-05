package weekendAssignment;

import java.util.Calendar; 
import java.util.GregorianCalendar; 
import java.util.Scanner;

class UserMainCode21 {
	
	public static String getDay(String date) {
		int year, month, day;
		int i1 = date.indexOf('-');
		int i2 = date.lastIndexOf('-');
		month = Integer.parseInt(date.substring(0, i1));
		day = Integer.parseInt(date.substring(i1+1, i2));
		year = Integer.parseInt(date.substring(i2+1));
		String days[] = {"Invalid","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		Calendar calendar = new GregorianCalendar(year, month - 1, day); 
        return days[calendar.get(Calendar.DAY_OF_WEEK)];
	}
}

class Main21 {
	public static void main(String[] args) {
		System.out.println("Enter date (mm-dd-yyyy):");
		Scanner in = new Scanner(System.in);
		String date = in.next();
		System.out.println(UserMainCode21.getDay(date));
		in.close();
	}
}