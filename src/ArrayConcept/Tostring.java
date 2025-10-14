package ArrayConcept;
import java.util.Arrays;
public class Tostring {

	public static void main(String[] args) {
		int arr[]= {1,23,4,5,6};
		System.out.println(Arrays.toString(arr));
		int temp=arr[0];
		arr[0]=arr[2];
		arr[2]=temp;
		System.out.println(Arrays.toString(arr));
       
	}

}
