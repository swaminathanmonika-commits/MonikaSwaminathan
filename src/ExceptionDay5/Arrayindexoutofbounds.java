package ExceptionDay5;

public class Arrayindexoutofbounds {

	public static void main(String[] args) {
    int size=5;
    int arr[]=new int[5];
    arr[0]=10;
    arr[1]=20;
    arr[2]=30;
    arr[3]=40;
    try {
    	System.out.println(arr[10]);
    }catch(ArrayIndexOutOfBoundsException e) {
    	System.out.println(e.getMessage());
    }
    System.out.println("next operation");
	}

}
