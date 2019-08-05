/**
 * 
 */
package weekendAssignment;

/**
 * @author shparashar
 *
 */
import java.util.ArrayList;
import java.util.List;

public class ListStrings {
	List<String> listOfStr;
	public
	ListStrings(){
		listOfStr=new ArrayList<String>();  
	}
	void insertInList(String ele){
		listOfStr.add(ele);
	}
	boolean searchInList(String ele){
		return listOfStr.contains(ele);
	}
	boolean deleteInList (String ele){
		return listOfStr.remove(ele);
	}
	void displayList (){
		for(String s:listOfStr){  
			System.out.println(s);  
		}  
	}
}