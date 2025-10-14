package ArrayConcept;

public class Maximum2 {

	public static void main(String[] args) {
		int num[]= {25,99,15,46,78,93};
		  int Fmax=0;
		  int Smax=0;
		  if(num[0]>num[1]) {
			  Fmax=num[0];
			  Smax=num[1];
			
			  }
		  else {
			  Fmax=num[1];
			  Smax=num[0];
			  }
		  for(int i=2;i<num.length;i++) {
		  if(num[i]>Fmax) {
			  Smax=Fmax;
			  Fmax=num[i];
		  }
			  
		  }
		  System.out.println("First Maximum:"+Fmax);
		  System.out.println("Second Maximum:"+Smax);
		
	}  
		 
	}



