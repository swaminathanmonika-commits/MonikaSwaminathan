package NestedLooping;
import java.util.Scanner;
public class Primeinrange {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int start=s.nextInt();
		int end=s.nextInt();
		for(int num=start;num<=end;num++) {
			int count=0;
			for(int i=1;i<=num;i++) {
				if(num%i==0) {
					count ++;
				}
					
		}
		if(count==2) {
			System.out.println(num);
		}
		
		
		}}}