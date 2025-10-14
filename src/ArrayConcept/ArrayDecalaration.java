package ArrayConcept;

public class ArrayDecalaration {

	public static void main(String[] args) {
      String arr[]= {"Monika","Nathis","Priya","Raks"};
      System.out.println(arr[0]);
      arr[0]="Deepa";//pointing the address
      System.out.println(arr[0]);
      System.out.println(arr.length);
      System.out.println(arr[arr.length-1]);
      System.out.println(arr.length);
      for(int i=0;i<arr.length;i++) {
    	  System.out.println(arr[i]);
      }
}
}