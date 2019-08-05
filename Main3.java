package weekendAssignment;

import java.util.Scanner;

class UserMainCode3 {
	public static int countNoOfWords(String s1, String s2){
		String split1[] = s1.split(" ");
		String split2[] =s2.split(" ");
		int count = 0;
		for(int i=0;i<split1.length;i++){
			if(split1[i].equals(split2[1])){
				count++;
			}
		}
		return count;
	}
}

public class Main3 {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string: ");
		String w1 = sc.nextLine();
		System.out.println("Enter the second string: ");
		String w2 = sc.nextLine();
		System.out.println("Answer is: " + UserMainCode3.countNoOfWords(w1, w2));
	}
}

