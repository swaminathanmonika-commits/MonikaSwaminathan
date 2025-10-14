package Methods;
import java.util.Scanner;

public class Addition {
	void Monika () {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int res=a+b;
		System.out.println(res);
	}
	public static void main(String[] args) {
		Addition ob1=new Addition();
		System.out.println("meth calling 1");
		ob1.Monika();//method calling part
		System.out.println("meth return 1");
		System.out.println("meth calling 2");
		ob1.Monika();//method calling part
		System.out.println("meth return 2");
		System.out.println("meth calling 3");
		ob1.Monika();//method calling part
		System.out.println("meth return 3");	
              		}
		

	}

