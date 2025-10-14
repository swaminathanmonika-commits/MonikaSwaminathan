package ArrayConcept;
import java.util.Arrays;
public class Bubblesort {

	public static void main(String[] args) {
		int arr[]= {12,22,33,44,55,66};
		System.out.println(Arrays.toString(arr));
		for(int lc=0;lc<arr.length;lc++) {
			for(int i=0;i<arr.length-1;i++) {
				if(arr[i]>arr[i+1]) {
					int temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
			}
		}
System.out.println(Arrays.toString(arr));
	}

}}
