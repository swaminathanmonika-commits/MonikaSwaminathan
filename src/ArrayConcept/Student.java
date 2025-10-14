package ArrayConcept;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no of Subjects");
		int sub=s.nextInt();
		int mark[]=new int[sub];
		System.out.println("Enter the marks");
		for(int i=0;i<mark.length;i++) {
			mark[i]=s.nextInt();
		}
		int total=0;
		for(int i=0;i<mark.length;i++) {
			total=total+mark[i];
		}
		System.out.println(total);
		System.out.println((float)total/mark.length);
			
        }
	}

