package weekendAssignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

class UserMainCode5 {
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

public class Main5 {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
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
		System.out.println("Average is:" +UserMainCode5.getAverageOfOdd(hmap));
	}
}