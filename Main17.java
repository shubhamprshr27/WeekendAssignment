package weekendAssignment;

import java.util.Scanner;

class UserMainCode17{
	public static int findMaxDistance (int[] arr) {
		int maxIndex=0;
		int maxDiff=Integer.MIN_VALUE;
		for(int i=1;i<arr.length;i++) {
			if(Math.abs(arr[i]-arr[i-1]) > maxDiff ) {
				if(arr[i]>arr[i-1]) maxIndex=i;
				else maxIndex=i-1;
			}		
		}
		return maxIndex;
	}
	
}
public class Main17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements");
		int n=sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(UserMainCode17.findMaxDistance(arr));
	}

}