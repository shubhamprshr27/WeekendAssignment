/**
 * 
 */
package weekendAssignment;

/**
 * @author shparashar
 *
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

class UserMainCode22 {
	static boolean isEligible(String name) {
		if (!Character.isLowerCase(name.charAt(0)) || !Character.isUpperCase(name.charAt(name.length()-1)))
			return false;
		for (int i = 0; i < name.length(); i++) {
			if (Character.isDigit(name.charAt(i)))
				return true;
		}
		return false;
	}
	public static ArrayList<String> getName(HashMap<Integer, String> hm) {
		ArrayList<String> list = new ArrayList<String>(hm.size());
		Iterator<Entry<Integer, String>> hmIterator = hm.entrySet().iterator(); 
		while (hmIterator.hasNext()) { 
            Map.Entry<Integer, String> mapElement = (Entry<Integer, String>)hmIterator.next(); 
            String name = (String) mapElement.getValue();
            if (isEligible(name))
            	list.add(name);
        } 
		return list;
	}
}

public class Main22 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter no:");
		int n = in.nextInt();
		 HashMap<Integer, String> map = new HashMap<>(); 
		for (int i = 0; i < n; i++) {
			System.out.println("Enter key:");
			int k = in.nextInt();
			System.out.println("Enter name:");
			String name = in.next();
			map.put(k,name);
		}
		ArrayList<String> list = UserMainCode22.getName(map);
		for (int i = 0; i < list.size(); i++) 
			System.out.println(list.get(i));
		in.close();
	}
}