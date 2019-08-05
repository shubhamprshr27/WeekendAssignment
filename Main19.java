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

class UserMainCode19{
	public static String  getLastLetter (String str) {
		StringTokenizer st = new StringTokenizer(str);
		StringBuilder ans=new StringBuilder("");
		String temp;
		while(st.hasMoreTokens()) {
			temp=st.nextToken();
			if((ans+"").equals("")) ans.append(temp.charAt(temp.length()-1));
			else ans.append("$"+temp.charAt(temp.length()-1));
		}
		return (ans+"").toUpperCase();

	}
	
}
public class Main19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string:");
		System.out.println(UserMainCode19.getLastLetter(sc.nextLine()));
	}

}