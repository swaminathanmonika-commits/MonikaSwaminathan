package ExceptionDay5;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Inputmismatchexception {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	try {
		int n=s.nextInt();
		System.out.println(n+1);
	}catch(InputMismatchException e) {
		System.out.println("Input not match");
	}

	}

}
