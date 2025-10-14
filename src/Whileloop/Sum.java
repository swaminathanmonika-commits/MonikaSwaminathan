package Whileloop;

public class Sum {

	public static void main(String[] args) {
		int num=234;
		int sum=0;
		while(num!=0) {
			int last=num%10;
			sum=(sum*10)+last;
			num=num/10;
		}
System.out.println(sum);
	}

}
