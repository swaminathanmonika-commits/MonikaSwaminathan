package Whileloop;

public class Maximumnumber {

	public static void main(String[] args) {
		int num=29745;
		int max=num%10;
		while(num!=0) {
			if(max<num%10) {	
				max=num%10;
			}
			num=num/10;
		}
		System.out.println(max);
	}

}
