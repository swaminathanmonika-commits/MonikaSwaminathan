package Whileloop;

public class Star {

	public static void main(String[] args) {
		int len=5;
		for(int i=0;i<=len;i++) {
			for(int j=len-i;j>1;j--) {
			System.out.print("");
		}
		for(int j=0;j<=i;j++) {
			System.out.print(" *");
		}
		System.out.println();
    }}
}