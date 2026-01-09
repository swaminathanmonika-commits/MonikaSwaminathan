package Day7;

public class BinarySearch {
	public static void main(String[] args) {
    int arr[]= {3,5,7,9,10};
    int s=10;
    int l=0;
    int r=arr.length-1;
    while(l<=r) {
    	int mid=(l+r)/2;
    	if(s==arr[mid]) {
    		System.out.println("found");
    		break;
    	}
    	else if(arr[mid]>s) {
    		r=mid+1;
    	}else {
    		l=mid+1;
    	}
    }
    if(l>r) {
    	System.out.println("Not found");
    }
	}
}
