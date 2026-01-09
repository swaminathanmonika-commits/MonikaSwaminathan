package ExceptionDay5;

public class Negativepointer {

	public static void main(String[] args) {
   try {
	   int size=-1;
	   int [] arr=new int[size];
	   arr[0]=10;
	   arr[1]=20;
	   System.out.println(arr[1]);
   }catch(NegativeArraySizeException e) {
	   System.out.println(e);
   }
   System.out.println("next operation");
	}

}




