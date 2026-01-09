package Day7;

public class Count {
public static void main(String[] args) {
	int arr[]= {1,8,2,4,7,3,8};
	   int k=9;
	   int count=0;
	   for(int i=0;i<arr.length;i++) {
		   if(k==arr[i]) {
			  count++;
		   }
	   }
	   if(count>0) {
		   System.out.println(count);
	   }else {
		   System.out.println("Element not found");
	   }
	
}
}