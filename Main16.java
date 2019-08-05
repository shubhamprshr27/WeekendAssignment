/**
 * 
 */
package weekendAssignment;

/**
 * @author shparashar
 *
 */
import java.util.Scanner;
import java.util.StringTokenizer;

class UserMainCode16{
	public static String  findOldDate (String date1, String date2) {
		StringTokenizer st1 = new StringTokenizer(date1,"-");
		StringTokenizer st2 = new StringTokenizer(date2,"-");
		int day1 = Integer.parseInt(st1.nextToken()) ;
		int month1 = Integer.parseInt(st1.nextToken()) ;
		int year1 = Integer.parseInt(st1.nextToken()) ;
		int day2 = Integer.parseInt(st2.nextToken()) ;
		int month2 = Integer.parseInt(st2.nextToken()) ;
		int year2 = Integer.parseInt(st2.nextToken()) ;
		boolean flag=false;
		if(year1<year2) flag=true;
		else if (year1==year2 && month1<month2) flag=true;
		else if (year1==year2 && month1==month2 && day1<day2) flag=true;
		if(flag) return day1+"/"+month1+"/"+year1;
		else return day2+"/"+month2+"/"+year2;
	}
	
}
public class Main16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter dates:");
		System.out.println(UserMainCode16.findOldDate(sc.nextLine(),sc.nextLine()));
	}

}