package StringConcept;
import java.util.Arrays;
public class Methods {

	public static void main(String[] args) {
		String st1="Monika is a jAVA Programmer";
	    System.out.println(st1.indexOf('i'));
	    System.out.println(st1.indexOf("i"));
	    System.out.println(st1.indexOf("is"));
	    System.out.println(st1.lastIndexOf("i"));
	    System.out.println(st1.indexOf("e"));
	    System.out.println(st1.indexOf("e",15));
	    System.out.println(st1.indexOf("e",18,25));
	    System.out.println(st1.indexOf("e",18,25));
	    System.out.println(st1.contains("Pro"));
	    System.out.println(st1.contains("protect"));
	    System.out.println(st1.substring(11));
	    System.out.println(st1.substring(11,20));
	    System.out.println(st1.endsWith("Programmer"));
	    
	    System.out.println(st1.replace("jAVA","python"));
	    System.out.println(st1.replaceFirst("Monika","Nathiksha"));
	    System.out.println(st1.replaceAll("[aeio]","/"));
	                
	}}