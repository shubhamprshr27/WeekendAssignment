/**
 * 
 */
package weekendAssignment;

/**
 * @author shparashar
 *
 */
import java.util.HashMap;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;


class UserMainCode7 {
	
	static boolean isEligible(String startDate) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
		long years = ChronoUnit.YEARS.between(LocalDate.parse(startDate, formatter), LocalDate.parse("01/01/2014", formatter));
		return years >= 60;
	}
	
	public static ArrayList<String> retirementEmployeeList (HashMap<String, String> hmap) {
		ArrayList<String> list = new ArrayList<>();
		hmap.forEach((k,v) -> {
			if(isEligible(v))
				list.add(k);
		});
		return list;
	}
}
public class Main7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the number of elements: ");
		n = sc.nextInt();
		HashMap<String, String> hmap = new HashMap<>();
		for(int i=0; i<n; i++) {
			String a = sc.next();
			String b = sc.next();
			hmap.put(a, b);
		}
		System.out.println(UserMainCode7.retirementEmployeeList(hmap));
	}
}