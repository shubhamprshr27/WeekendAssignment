/**
 * 
 */
package weekendAssignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author shparashar
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter quesiton number: ");
		choice = sc.nextInt();
		sc.nextLine();
		int n;
		switch (choice){
		case 1:
			System.out.println("Enter the first string: ");
			String word1 = sc.nextLine();
			System.out.println("Enter the second string: ");
			String word2 = sc.nextLine();
			System.out.println("Answer is: " + UserMainCode.replacePlus(word1, word2));
			break;
		case 2:
			System.out.println("Enter the size of array:");
			n = sc.nextInt();
			System.out.println("Enter the array:");
			int array[]=new int[n];
			for(int i=0;i<n;i++){
				array[i]=sc.nextInt();
			}
			sc.nextLine();
			int result=UserMainCode.addUniqueEven(array);
			if (result==0){
				System.out.println("no even numbers");
			}
			else{
				System.out.println(result);
			}
			break;
		case 3:
			System.out.println("Enter the first string: ");
			String w1 = sc.nextLine();
			System.out.println("Enter the second string: ");
			String w2 = sc.nextLine();
			System.out.println("Answer is: " + UserMainCode.countNoOfWords(w1, w2));
			break;
		case 4:
			System.out.println("Enter n :");
			int size = sc.nextInt();
			ArrayList<Integer> first = new ArrayList<>(size);
			ArrayList<Integer> second = new ArrayList<>(size);
			int element;
			System.out.println("Enter elements: ");
			for(int i=0;i<2*size;i++){
				element = sc.nextInt();
				if(i<size){
					first.add(element);
				}
				else{
					second.add(element);
				}
			}
			sc.nextLine();
			System.out.println("Result is" + Arrays.toString(
					UserMainCode.generateOddEvenList(first, second).toArray()));
			break;
		case 5:
			System.out.println("Enter Hashmap size");
			int hsize = sc.nextInt();
			HashMap<Integer,Integer> hmap = new HashMap();
			System.out.println("Enter key value pair");
			int k,v;
			for(int i=0;i<hsize;i++){
				k=sc.nextInt();v=sc.nextInt();
				hmap.put(k,v);
			}
			sc.nextLine();
			System.out.println("Average is:" +UserMainCode.getAverageOfOdd(hmap));
		}
	}

}
