package ExceptionDay5;
import java.util.Scanner;
public class Arithmeticexception {

	public static void main(String[] args) {
  Scanner s=new Scanner(System.in);
  int a=s.nextInt();
  int b=s.nextInt();
  try {
	  float c=a/b;
	  System.out.println(c);
  }catch(ArithmeticException e) {
	  System.out.println(e.getMessage());
	  }finally {
		  System.out.println("default operation");
	  }
  System.out.println("next operation");
	}

}
