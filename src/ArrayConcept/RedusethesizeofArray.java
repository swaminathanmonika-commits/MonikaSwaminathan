package ArrayConcept;
import java.util.Arrays;
public class RedusethesizeofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr[]= {1,2,3,4,5};
       int dest[]=new int[10];
       System.arraycopy(arr,2, dest,5,arr.length-2);
       System.out.println(Arrays.toString(dest));
       
	}

}
