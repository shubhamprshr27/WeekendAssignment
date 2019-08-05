/**
 * 
 */
package weekendAssignment;

/**
 * @author shparashar
 *
 */
import java.util.*;
import java.time.LocalDate;
import java.time.Period;

class UserMainCode15 {
  
public static TreeMap<Integer,Integer> calculateRevisedSalary(HashMap<Integer,String> m1,HashMap<Integer,Integer> m2){
	
	TreeMap<Integer,Integer> tm=new TreeMap<Integer,Integer>(); 
	
	for(Map.Entry<Integer, String> it:m1.entrySet()){
		int id=it.getKey();
		String dob=it.getValue();
		int salary=m2.get(id);
		int age=getAge(dob);
		int bonus=-1;
		if(salary<5000) bonus=-100;
		else if(age<25 || age>60) bonus=-200;
		else if(age>=25 && age<=30) bonus = (2*salary)/10;
		else bonus = (3*salary)/10;
		tm.put(id, bonus);
		
	}
	 
	
	return tm;
   }
   
   public static int getAge(String dob){
	   String[] arr=dob.split("-");
	   int date=Integer.parseInt(arr[0]);
	   int month = Integer.parseInt(arr[1]);
	   int year=Integer.parseInt(arr[2]);
	   
	   LocalDate l = LocalDate.of(year,month,date); 
	   LocalDate now = LocalDate.of(2014, 9 ,01); 
	   Period diff = Period.between(l, now);
	   
	   return diff.getYears();
   }
}

public class Main15 {

	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count");
		int ecount = sc.nextInt();
	
		HashMap<Integer,String> m1 = new HashMap<Integer,String>();
		HashMap<Integer,Integer> m2=new HashMap<Integer,Integer>();
		
		TreeMap<Integer,Integer> tm;
		for(int i=0;i<ecount;i++){
			int id=sc.nextInt();
			String dob=sc.next();
			int salary = sc.nextInt();
			m1.put(id, dob);
			m2.put(id,salary);	
		}
		tm=UserMainCode15.calculateRevisedSalary(m1, m2);
		for(Map.Entry<Integer, Integer> it:tm.entrySet()){
			System.out.println(it.getKey());
			System.out.println(it.getValue());
		}
	}
	
}