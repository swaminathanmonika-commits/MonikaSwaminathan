package Day7;
public class Task3 {
	public static void main(String[] args) {
		int arr[]= {5,3,7,8,1,2,9,4};
		int odd=0;
		int even=0;
        for(int i=0;i<arr.length;i++) {
        	if(arr[i]%2==0) {
        		even+=arr[i];
        	}else {
        		odd+=arr[i];
        	}
        }
        System.out.println(odd);
        System.out.println(even);
	}

}
