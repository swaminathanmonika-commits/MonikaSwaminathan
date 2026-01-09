package Day8;
import java.util.Scanner;
public class Add2array {
	public static void main(Stringconcept[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int m=sc.nextInt();
		int b[]=new int[m];
		for(int i=0;i<m;i++) {
			b[i]=sc.nextInt();
		}
		int max=0;
		int min=0;
		boolean flag=false;
		if(n>m) {
			max=n;
			min=m;
			flag=true;
		}else {
			max=n;
			min=m;
		}
		int c[]=new int[max];
		for(int i=0;i<min;i++) {
			c[i]=a[i]+b[i];
		}
		if(flag) {
			for(int i=min;i<max;i++) {
				c[i]=a[i];
			}
		}else {
			for(int i=min;i<max;i++) {
				c[i]=b[i];
			}
		}
		for(int i:c) {
			System.out.println(i+ " ");
		}
     
	}

}
