/**
 * 
 */
package weekendAssignment;

/**
 * @author shparashar
 *
 */
import java.util.Scanner;
class UserMainCode14{
	
	static boolean validatePassword(String str){
		if(!str.matches(".*[a-zA-Z]+.*")){
			return false;
		}
		if(!str.matches(".*[0-9]+.*")){
			return false;
		}
		if(!str.matches(".*[#$@%?+^]+.*")){
			return false;
		}
		return true;
	}
	
}

public class Main14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a password: ");
		String password = scan.nextLine();
		if(UserMainCode14.validatePassword(password))
			System.out.println("Valid");
		else
			System.out.println("Invalid");
		scan.close();
	}
	
}