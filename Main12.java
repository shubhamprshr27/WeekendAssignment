/**
 * 
 */
package weekendAssignment;

/**
 * @author shparashar
 *
 */
import java.util.Scanner;

class UserCodeMain12{
	static String getWordWithMaximumVowels(String sentence){
		String maxVowel= "";
		int maxVowelCount = 0;
		
		sentence = sentence.trim();
		String[] words = sentence.split(" ");
		for (String word : words) {
			int count = 0;
			for(int i=0; i<word.length(); i++){
				switch(word.charAt(i)){
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					count += 1;
					break;
				}
			}
			if(count>maxVowelCount){
				maxVowel = word;
				maxVowelCount = count;
			}
		}
		return maxVowel;
	}
}

public class Main12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String sentence = scan.nextLine();
		String maxVowelWord = UserCodeMain12.getWordWithMaximumVowels(sentence);
		System.out.println("Maximum vowel is in the word: " + maxVowelWord);
		scan.close();
	}
}