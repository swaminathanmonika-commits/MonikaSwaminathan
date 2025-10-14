package ArrayConcept;

public class Maximum {

	public static void main(String[] args) {
	  int num[]= {25,99,15,46,78,93};
	  int max=num[0];
	  for(int i=1;i<num.length;i++) {
		  if(max<num[i]) {
			  max=num[i];
		  }
	  }
	  System.out.println(max);
	  
	 
}}



