package Day8;

public class Stringconcept {
	public static void main(java.lang.String[] args) {
   String s1="Hello welcome";
   String s2=" World";
   System.out.println(s1.length());
   System.out.println(s1.charAt(2));
   System.out.println(s1.equals(s2));
   System.out.println(s1.concat(s2));
   System.out.println(s1.contains("ll"));
   System.out.println(s1.indexOf("llo"));
   System.out.println(s1.isEmpty());
   System.out.println(s1.replace("l","h"));
   System.out.println(s1.substring(2));
   System.out.println(s1.substring(2,5));
   System.out.println(s1.startsWith("H"));
   System.out.println(s1.endsWith("H"));
   System.out.println(s1.toUpperCase());
   System.out.println(s1.toLowerCase());
   System.out.println(s1.replaceAll("[aeio]","/"));
	}

}
