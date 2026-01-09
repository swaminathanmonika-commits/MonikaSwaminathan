package Day4;
import java.util.Scanner;
class circle{
	static void Area(int r){
		System.out.println(3.14*r*r);
		}
	static void Area(int l,int b) {
		System.out.println(l*b);
	}
}
public class Task1 {
      public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int choice=s.nextInt();
		if(choice==1) {
			int r=s.nextInt();
			circle.Area(r);
		}else if(choice==2) {
			int l=s.nextInt();
			int b=s.nextInt();
			circle.Area(l,b);
		}else {
			System.out.println("Invalid Input");
		}
     }
}
