package Day8;

public class Task1 {

	public static void main(String[] args) {
		String s="Madam";
		String rev="";
		s=s.toLowerCase();
		for(int i=s.length()-1;i>=0;i--) {
			rev+=s.charAt(i);
		}
		if(s.equals(rev)) {
			System.out.println("palindrome");
		}else {
			System.out.println("not a palindrome");
		}
	}

}
