package ArrayConcept;

public class MatrixAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{10,20,30},{40,50,60},{70,80,90}};
		int brr[][]= {{10,20,30},{40,50,60},{70,80,90}};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+brr[i][j]+" ");
				}
         System.out.println();
				
			}
			
		}
}
