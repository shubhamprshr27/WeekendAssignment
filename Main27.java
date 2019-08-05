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
import java.util.Scanner;

public class Main27 {
	public static void main(String[] args) {
		String name;
		String isAvailable;
		String author;
		String email;
		String gender;
		int authorCount;
		int qtyInStock;
		double price;
		List<Author> authorList = new ArrayList<>();
		Book book;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the book name");
		name = sc.nextLine();
		System.out.println("Enter the number of authors");
		authorCount = sc.nextInt();
		for(int i=0; i<authorCount; i++) {
			System.out.println("Enter the author name");
			author = sc.next();
			System.out.println("Enter the author email id:");
			email = sc.next();
			System.out.println("Enter the author's gender");
			gender = sc.next();
			authorList.add(new Author(author, email, gender));
		}
		System.out.println("Enter the book price");
		price = sc.nextDouble();
		System.out.println("Is the book currently available? Type “Yes/No” (Not case sensitive)");
		isAvailable = sc.next();
		if(isAvailable.toLowerCase().equalsIgnoreCase("yes")) {
			System.out.println("Enter the number of books available");
			qtyInStock = sc.nextInt();
			book = new Book(name, authorList, price, qtyInStock);
		} else {
			book = new Book(name, authorList, price);
		}
		System.out.println(book);
	}
}