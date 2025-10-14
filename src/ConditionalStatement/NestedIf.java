package ConditionalStatement;

public class NestedIf {

	public static void main(String[] args) {
    int mark=80;
    if(mark>=0&&mark<=100) {
    	if(mark<=35) {
    		System.out.println("fail");
    	}
    	else if(mark>=35&&mark<=50){
    		System.out.println("average");
    	}
    	else if(mark>=50&&mark<=80) {
    		System.out.println("good");
    	}
    	else if(mark>=80&&mark<=100) {
    		System.out.println("Excellent");
    	}
    }
    else {
    	System.out.println("absent");
    }

	}

}
