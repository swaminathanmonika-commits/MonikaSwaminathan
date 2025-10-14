package CollectionConcept;

public class Primitive_to_nonprimitive {

	public static void main(String[] args) {
		int num=1025;
		String st =String.valueOf(num);
		StringBuffer sb=new StringBuffer();
		sb.append(st);
		System.out.println(sb.reverse());
		Integer nu=Integer.valueOf(num);
		float f=2-.25f;
		Float f1=Float.valueOf(f);
	}

}
