package weekendAssignment;

import java.util.Scanner;

class UserMainCode2 {
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
}

public class Main2 {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n = sc.nextInt();
		System.out.println("Enter the array:");
		int array[]=new int[n];
		for(int i=0;i<n;i++){
			array[i]=sc.nextInt();
		}
		sc.nextLine();
		int result=UserMainCode2.addUniqueEven(array);
		if (result==0){
			System.out.println("no even numbers");
		}
		else{
			System.out.println(result);
		}
	}
}

