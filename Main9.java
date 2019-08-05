/**
 * 
 */
package weekendAssignment;

/**
 * @author shparashar
 *
 */
import java.util.Scanner;

class UserMainCode9 {
	
	static int countVowels(String s) {
		int count = 0;
		for(int i = 0; i < s.length(); ++i) {
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u')
                ++count;
        }
        return count;
	}
	
	public static String storeMaxVowelWord(String str) {
		String[] list = str.split(" ");
		String ans="";
		int max = 0;
		for(String s: list) {
			int count = countVowels(s);
			if(countVowels(s) > max) {
				max = countVowels(s);
				ans = s;
			}
		}
		return ans;
	}
}
public class Main9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(UserMainCode9.storeMaxVowelWord(str.toLowerCase()));
	}
}