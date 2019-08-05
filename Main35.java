/**
 * 
 */
package weekendAssignment;

/**
 * @author shparashar
 *
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Cards {

	Map< String , List<Integer> > cardMap;
	
	public Cards() {
		cardMap=new HashMap<String,List<Integer>>();
	}
	
	public void insertCard(String symbol,int value) {
		if(!cardMap.containsKey(symbol)) {
			List<Integer> l1=new ArrayList<Integer>();
			l1.add(value);
			cardMap.put(symbol, l1);
		}else
		cardMap.get(symbol).add(value);
	}
	
	public void displayCardDetails() {
		 ArrayList<String> sortedKeys = 
                 new ArrayList<String>(cardMap.keySet());       
		 Collections.sort(sortedKeys);
		System.out.println("Distinct Symbols are :");
		for(String sym:sortedKeys)
			System.out.printf(" %s ",sym);
		System.out.println();
		for(String sym:sortedKeys) {
			System.out.printf("Cards in %s are :\n",sym);
			List<Integer> temp=cardMap.get(sym);
			int sumval=0;
			for(int val:temp) {
				System.out.printf("%s %d \n",sym,val);
				sumval+=val;
			}
			System.out.printf("Number of cards :%d\n",temp.size());
			System.out.printf("Sum of Numbers :%d\n",sumval);

		}
		
	}
}

public class Main35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Cards card = new Cards();
		System.out.println("Enter Number of Cards :");
		int numCards=sc.nextInt();
		for(int i=1;i<=numCards;i++) {
			System.out.printf("Enter card %d:\n",i);
			String sym=sc.next();
			int val=sc.nextInt();
			card.insertCard(sym, val);
		}
		card.displayCardDetails();
		sc.close();
	}

}