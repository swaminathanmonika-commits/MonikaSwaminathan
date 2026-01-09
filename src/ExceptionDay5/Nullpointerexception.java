package ExceptionDay5;

public class Nullpointerexception {

	public static void main(String[] args) {
String s="hello";
String arr[]=new String[2];
arr[0]="h";
arr[1]="e";
arr[2]="l";
arr[3]="l";
arr[4]="o";
try {
	System.out.println(arr[0]);
}catch(NullPointerException e) {
	System.out.println(e.getMessage());
}catch(Exception e) {
	System.out.println(e.getMessage());
}
	}

}
