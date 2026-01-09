package Day7;
public class BinarySearchRec {
	static int binarySearch(int arr[],int l,int r,int k) {
		int mid=(l+r)/2;
		if(l>r) {
			return -1;
		}
		if(k==arr[mid]) {
			return mid;
		}else if(arr[mid]>k) {
			return binarySearch(arr,l,mid-1,k);
		}else {
			return binarySearch(arr,mid+1,r,k);
			}
	}
	public static void main(String[] args) {
		int arr[]= {2,3,5,6,8};
		int l=0;
		int r=arr.length-1;
		int k=8
				;
		int ans=binarySearch(arr,l,r,k);
		if(ans==-1) {
			System.out.println("Not Found");
		}else {
			System.out.println(ans);
		}
		

	}

}
