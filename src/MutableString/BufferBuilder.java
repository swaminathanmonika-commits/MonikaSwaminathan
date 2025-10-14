package MutableString;

public class BufferBuilder {

	public static void main(String[] args) {
		String st1="Monika";
		StringBuilder Sb=new StringBuilder();
		System.out.println(Sb.capacity());
		System.out.println(Sb.length());
		Sb.append(st1);
		System.out.println(Sb);
		System.out.println(Sb.capacity());
		System.out.println(Sb.length());
		Sb.append(" is a good girl");
		System.out.println(Sb);
		System.out.println(Sb.capacity());
		System.out.println(Sb.length());
		System.out.println(Sb.replace(7, 10, "was "));
	    Sb.delete(7,10);
		System.out.println(Sb);
		Sb.insert(7, "is ");
        System.out.println(Sb);
        System.out.println(st1.concat(" Swaminathan"));
		Sb.reverse();
		System.out.println(Sb);
        
	}

}