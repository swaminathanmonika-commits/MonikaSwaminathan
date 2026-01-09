package Day8;

public class Primenumber1 {

	public static void main(Stringconcept[] args) {
   int arr[]= {1,2,3,4,5,6,7,8,9,10,11,22,33,44,55,66};
   for(int i=0;i<arr.length;i++) {
	   boolean flag=false;
	    for(int j=2;j<=arr[i]/2;j++) {
	    	if(arr[i]%2==0) {
	    		flag=true;
	    		break;
	    	}
	    }
	    if(!flag) {
	    	System.out.println(arr[i]);
	    }
   }
	}

}
