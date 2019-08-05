/**
 * 
 */
package weekendAssignment;

/**
 * @author shparashar
 *
 */
import java.util.Scanner;

public class Main34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListStrings ListStrings = new ListStrings();
		boolean flag=true;
		int choice;
		Scanner sc=new Scanner(System.in);
		while(flag) {
			System.out.println("1. Insert\r\n" + 
					"2. Search\r\n" + 
					"3. Delete\r\n" + 
					"4. Display\r\n" + 
					"5. Exit\r\n" + 
					"Enter your choice : " + 
					"");
			choice=sc.nextInt();
			String ele;
			switch(choice) {
			case 1:	System.out.println("Enter the item to be inserted: ");
					ele=sc.next();
					ListStrings.insertInList(ele);
					break;
			case 2: System.out.println("Enter the item to search : ");
					ele=sc.next();
					if(ListStrings.searchInList(ele))
						System.out.println("Item found in the list");
					else
						System.out.println("Item not found in the list");
					break;
			case 3: System.out.println("Enter the item to delete : ");
					ele=sc.next();
					if(ListStrings.deleteInList(ele))
						System.out.println("Item deleted from the list");
					else
						System.out.println("Item not found in the list");
					break;
			case 4: ListStrings.displayList();
					break;
			case 5: flag=false; 
					System.out.println(" Program ended ");
					break;
			default: System.out.println(" wrong option ");
					break;
			}
		}
		
		sc.close();
	}

}