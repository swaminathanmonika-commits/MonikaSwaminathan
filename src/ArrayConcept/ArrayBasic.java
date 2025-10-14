package ArrayConcept;
import java.util.Scanner;
public class ArrayBasic {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int [] num=new int [5];
		num[0]=s.nextInt();
		for(int i=0;i<num.length;i++) {
           num[i]=s.nextInt();			
		}
		for(int i=0;i<num.length;i++) {
		System.out.println(num[i]);
		

	}

}}
