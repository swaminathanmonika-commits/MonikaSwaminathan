package ArrayConcept;
import java.util.Scanner;
public class Foreachloop {

	public static void main(String[] args) {
		int arr[]= {25,99,77,88,66,33};
		int temp=arr[0];
		arr[0]=arr[2];
		arr[2]=temp;
		for(int i=0;i<arr.length;i++) {
			System.out.println(i+" :"+arr[i]);
		}
		System.out.println("For each loop");
		for(int n:arr) {
			System.out.println(n);
		}

	}

}
