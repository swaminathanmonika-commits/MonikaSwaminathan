package ArrayConcept;

public class SortedUnsorted {

	public static void main(String[] args) {
		int arr[]={25,99,15,46,78,93};
		for(int i=1;i<arr.length-1;i++) {
		if(arr[i]>arr[i+1]) {
			System.out.println("unsorted");
			break;         
			
		}
		else {
			System.out.println("sorted");
		    break;
		}
	    }

    }
}
