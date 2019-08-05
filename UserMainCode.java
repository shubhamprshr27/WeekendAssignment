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
public class UserMainCode {

	/**
	 * @param args
	 */
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
	public static int  addUniqueEven(int array[]){
		int arr[]=new int [200000];
        int sum=0;
        for(int i=0;i<array.length;i++)
        {
            arr[array[i]+100000]=1;
        }
        for(int i=0;i<200000;i++)
        {
            if(i%2==0 && arr[i]==1)
            {
                sum=sum+i-100000;
            }
        }
        return sum;
	}
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
	
	public static Integer getAverageOfOdd(HashMap<Integer, Integer> map){
		Integer sum = 0;
		Integer oddcount=0;
		for(Integer key : map.keySet()){
			if(key%2!=0){
				sum=sum+map.get(key);
				oddcount++;
			}
		}
		if(oddcount==0)
			return 0;
		return (sum/oddcount);
	}

}
