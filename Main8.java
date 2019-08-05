/**
 * 
 */
package weekendAssignment;

/**
 * @author shparashar
 *
 */
import java.util.Scanner;

class UserMainCode8 {
	public static int getKaprekarNumber(int n) {
		int square = n*n;
		int d = String.valueOf(n).length();
		String str = String.valueOf(square);
		String firstHalf = str.substring(0, d);
		String secondHalf = str.substring(d);
		if(Integer.parseInt(firstHalf) + Integer.parseInt(secondHalf) == n)
			return 1;
		return -1;
	}
}

public class Main8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		if(n<=3 || UserMainCode8.getKaprekarNumber(n) == -1)
			System.out.println("Not A Kaprekar Number");
		else
			System.out.println("Kaprekar Number");
		
	}
}