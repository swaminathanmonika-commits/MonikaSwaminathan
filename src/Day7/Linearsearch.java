package Day7;
public class Linearsearch {
public static void main(String[] args) {
   int arr[]= {1,8,2,4,7,3};
   int k=8;
   boolean flag=false;
   for(int i=0;i<arr.length;i++) {
	   if(k==arr[i]) {
		   flag=true;
	   }
   }
   if(flag) {
	   System.out.println("yes");
   }else {
	   System.out.println("No");
   }
	}

}
