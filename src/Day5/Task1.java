package Day5;
import java.util.ArrayList;
import java.util.Scanner;
public class Task1 {
	public static void main(String[] args) {
		ArrayList<String> alist=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int min=0;
		int pos=0;
		for(int i=0;i<n;i++) {
			String s=sc.next();
			int len=s.length();
			if(len<min) {
				min=len;
				pos=i;
			}
			alist.add(s);
		}
		String change=sc.next();
		alist.set(pos, change);
		System.out.println(alist);
	}

}
