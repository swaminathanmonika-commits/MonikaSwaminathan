package ConditionalStatement;
import java.util.Scanner;
public class demo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number:");
		int num=s.nextInt();
		if(num%3==0) {
			System.out.println("Fizz");
		}
		else if(num%5==0) {
			System.out.println("Buzz");
		}
      
	}

}                       
