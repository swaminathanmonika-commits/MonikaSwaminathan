package ArrayConcept;

public class Maximum3 {

	public static void main(String[] args) {
		int arr[]= {25,99,15,46,78,93};
		int fmax=arr[0];
		int smax=arr[1];
		for(int i=0;i<=arr.length-1;i++) {
			if(fmax<arr[i]) {
				smax=fmax;
				fmax=arr[i];
			}
		}
		System.out.println(fmax);
		  System.out.println(smax);
	}

}
