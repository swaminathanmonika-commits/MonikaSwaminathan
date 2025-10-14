package StringConcept;

public class Methods1 {

	public static void main(String[] args) {
		/*String st1="Monika Swaminathan";
		char ch[]=st1.toCharArray();
		for(char c:ch) {
			System.out.println(c);
			
		}
		}*/
		String st2="monika is a programmer    ";
		String arr[]=st2.split(" ");
		for(String st:arr) {
			System.out.println(st);
		}
		System.out.println(arr.length);
	}

}
