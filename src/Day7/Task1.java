package Day7;
public class Task1 {
	public static void main(String[] args) {
		int arr[]= {5,3,7,8,1,2,9,4};
		int max=0;
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			else if(arr[i]<min){
				min=arr[i];
			}
		}
		System.out.println("Maximum:"+max);
		System.out.println("Minimum:"+min);

	}

}
