/**
 * 
 */
package weekendAssignment;

import java.util.Scanner;
/**
 * @author shparashar
 *
 */
import java.util.Arrays;
import java.util.Scanner;

class UserMainCode6 {
	static int getAnagram(String a, String b) {
		char[] tempA = a.toCharArray();
		char[] tempB = b.toCharArray();
		Arrays.sort(tempA);
		Arrays.sort(tempB);
		a = new String(tempA);
		b = new String(tempB);
		if(a.equals(b))
			return 1;
		return -1;
	}
}
public class Main6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 2 strings: ");
		String a = sc.next();
		String b = sc.next();
		
		if(UserMainCode6.getAnagram(a, b) == 1)
			System.out.println("Anagrams");
		else
			System.out.println("Not Anagrams");
	}
}