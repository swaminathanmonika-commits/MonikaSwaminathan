package CollectionConcept;

public class Primitive_to_nonprimitive {

	public static void main(String[] args) {
		//auto boxing
		int num=1025;
		Integer nu=Integer.valueOf(num);
		Integer n=num;
		//unboxing
		Integer no=2564;
		int op=no.intValue();
		int o=no;
		
		//Non primitive to Non Primitive
		//Integer to String
		Integer no1=5648;
		String st1=String.valueOf(no1);
		
		//String to Integer
		String st="56789";
		Integer res=Integer.parseInt(st);
	}

}
