package operators;

public class TernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int mark=108;
        String res=(mark>49)?"pass":"Fail";
        String op=(mark>=0&&mark<=100)?((mark>49)?"pass":"fail"):"Invalid Mark";
        System.out.println(op);
	}
}
