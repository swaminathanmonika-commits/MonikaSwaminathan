package ArrayConcept;
import java.util.Scanner;
public class Abc {

	public static void main(String[] args) {
		int arr[][]=new int[3][3];
		//get input
		Scanner abc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the data:");
				arr[i][j]=abc.nextInt();
			}
			System.out.println();
		}

	}

}
