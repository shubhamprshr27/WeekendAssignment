/**
 * 
 */
package weekendAssignment;
import java.util.Scanner;
/**
 * @author shparashar
 *
 */
class UserMainCode13{
	static String swapPairs(String str){
		String revStr = "";
		for(int i=0; i<str.length(); i+=2){
			if((i+1)<str.length()-1)
				revStr += str.charAt(i+1);
			revStr += str.charAt(i);
		}
		return revStr;
	}
}

public class Main13 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a line");
		String str = scan.nextLine();
		String revLine = UserMainCode13.swapPairs(str);
		System.out.println("Reverse of the string is:");
		System.out.println(revLine);
		scan.close();
	}
}