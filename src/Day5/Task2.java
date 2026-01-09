package Day5;

import java.util.Hashtable;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
	    Hashtable<String,Integer> ht=new Hashtable<>();
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    for(int i=0;i<n;i++) {
		 String name=sc.next();
		 int age=sc.nextInt();
		 if(age>18) {
			 System.out.println(age+1);
			 ht.put(name,age+1);

		 }else {
			 System.out.println(ht.remove(name, age));
		 }

	    }
	    System.out.println(ht);
	    }
	}


