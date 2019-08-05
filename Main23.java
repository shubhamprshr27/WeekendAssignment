/**
 * 
 */
package weekendAssignment;

/**
 * @author shparashar
 *
 */
import java.util.Scanner;

class UserMainCode23 {
	
	public static String convertDateFormat(String date) {
		int i1 = date.indexOf('/');
		int i2 = date.lastIndexOf('/');
		int dd = Integer.parseInt(date.substring(0, i1));
		int mm = Integer.parseInt(date.substring(i1+1,i2));
		int yy = Integer.parseInt(date.substring(i2+1));
		yy = yy%100;
		return dd + "-" + mm + "-" + yy;
	}
}

public class Main23 {
	public static void main(String[] args) {
		System.out.println("Enter date (dd/mm/yyyy):");
		Scanner in = new Scanner(System.in);
		String date = in.next();
		System.out.println(UserMainCode23.convertDateFormat(date));
		in.close();
	}
}