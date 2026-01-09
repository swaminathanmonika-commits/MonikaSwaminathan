package Day8;

public class Primenumber {
	public static void main(Stringconcept[] args) {
    int n=7;
    boolean flag=false;
    for(int i=2;i<=n/2;i++) {
    	if(n%2==0) {
    		flag=true;
    		break;
    	}
    }
    if(flag) {
    	System.out.println("Not prime");
    }else {
    	System.out.println("prime");
    }
	}

}
