package Methods;
import java.util.Scanner;
public class CheckingPrimeNumber {
	boolean prime(int num) {
		for(int i=2;i<num/2;i++) {
			if(num%i==0) {
				return false;
				}
			}
		return true;
	}
public static void main(String[] args) {
		CheckingPrimeNumber ob1=new CheckingPrimeNumber();
		System.out.println(ob1.prime(13)?"prime":"not a prime");
		System.out.println(ob1.prime(12)?"prime":"not a prime");
		
	}
}