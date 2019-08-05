/**
 * 
 */
package weekendAssignment;

/**
 * @author shparashar
 *
 */
import java.util.Scanner;

class UserMainCode18{
	public static int  validatePAN (String str) {
		if(str.length()!=8) return 2;
		if((str.charAt(0)>='A'&&str.charAt(0)<='Z') &&
		(str.charAt(1)>='A'&&str.charAt(1)<='Z') &&
		(str.charAt(2)>='A'&&str.charAt(2)<='Z') &&
		(str.charAt(3)>='0'&&str.charAt(3)<='9') &&
		(str.charAt(4)>='0'&&str.charAt(4)<='9') &&
		(str.charAt(5)>='0'&&str.charAt(5)<='9') &&
		(str.charAt(6)>='0'&&str.charAt(6)<='9') &&
		(str.charAt(7)>='A'&&str.charAt(7)<='Z'))
			return 1;
		return 2;
	}
	
}
public class Main18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Pan number");
		if(UserMainCode18.validatePAN(sc.nextLine()) ==1 ) 
			System.out.println("Valid");
		else System.out.println("Invalid");
	}

}