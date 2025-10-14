package foorloop;

public class Factors {

	public static void main(String[] args) {
		int num=100;
		int count=0;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				count ++;
				System.out.println(i);
				}
			}
		if(count==2) {
			System.out.println(num+"  is a prime");
		}
		else {
		System.out.println(num+" is not a prime");
		}
	}
}



