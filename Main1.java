package weekendAssignment;

import java.util.Scanner;

class UserMainCode1 {
	public static String replacePlus(String word1, String word2){
		int charMap2[] = new int[26];
		String word1copy = word1;
		word1 = word1.toLowerCase();
		word2 = word2.toLowerCase();
		for(int i=0;i<word2.length();i++){
			charMap2[(int)word2.charAt(i)-'a']++;
		}
		String answer="";
		for(int i=0;i<word1.length();i++){
			if(charMap2[(int)word1.charAt(i)-'a']>0){
				answer = answer+word1copy.charAt(i);
			}
			else{
				answer = answer+'+';
			}
		}
		return answer;
	}
}
public class Main1{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string: ");
		String word1 = sc.nextLine();
		System.out.println("Enter the second string: ");
		String word2 = sc.nextLine();
		System.out.println("Answer is: " + UserMainCode1.replacePlus(word1, word2));
	}
}
