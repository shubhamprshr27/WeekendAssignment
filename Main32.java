/**
 * 
 */
package weekendAssignment;

/**
 * @author shparashar
 *
 */
import java.util.Scanner;

 class UserMainCode32 {
	static public int returnAbs(int a){
		return Math.abs(a);
	}
	static public boolean compareNums(int a,int b){
		return a==b;
	}
}

public class Main32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first integer ");
		int a=sc.nextInt();
		System.out.println("Enter the second integer ");
		int b=sc.nextInt();
		System.out.printf("Absolute value of %d is %d\n",a,UserMainCode32.returnAbs(a));
		System.out.printf("Absolute value of %d is %d\n",a,UserMainCode32.returnAbs(a));
		if(UserMainCode32.compareNums(a, b))
			System.out.printf("%d = %d",a,b);
		else
			System.out.printf("%d != %d",a,b);
		
		sc.close();
	}

}