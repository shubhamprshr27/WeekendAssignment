package weekendAssignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class UserMainCode4 {
	public static ArrayList<Integer> generateOddEvenList (ArrayList<Integer> first, 
			ArrayList <Integer> second){
		ArrayList <Integer> result = new ArrayList();
		for(int i=0;i<first.size();i++){
			if(i%2!=0){
				result.add(first.get(i));
			}
			else{
				result.add(second.get(i));
			}
		}
		return result;
	}
}

public class Main4 {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
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
				UserMainCode4.generateOddEvenList(first, second).toArray()));
	}
}