package Day7;

public class Position {
public static void main(String[] args) {
	int arr[]= {1,8,2,4,7,3};
	   int k=8;
	   int pos=-1;
	   for(int i=0;i<arr.length;i++) {
		   if(k==arr[i]) {
			  pos=i;
		   }
	   }
	   if(pos==-1) {
		   System.out.println(k+" is Not found");
	   }else {
		   System.out.println("The element "+k+" is found in the "+pos+" index");
	   }
		}

	}