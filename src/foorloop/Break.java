package foorloop;

public class Break {

	public static void main(String[] args) {
		System.out.println("Break Statement");
		for(int i=1;i<=10;i++) {
			if(i==5) {
				break;
			}
			System.out.println(i);
		}
        System.out.println("continue Statement");
        for(int i=1;i<=10;i++) {
        if(i==5) {
        	continue;
        }
        System.out.println(i);
	}

	}}
