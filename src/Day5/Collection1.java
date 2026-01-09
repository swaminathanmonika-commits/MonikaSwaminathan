package Day5;
import java.util.ArrayList;
import java.util.Collections;
public class Collection1 {
	public static void main(String[] args) {
		ArrayList<String> alist=new ArrayList<>();
		System.out.println(alist.isEmpty());
		   alist.add("a");
		   alist.add("b");
		   alist.add("c");
		   alist.add(1,"d");
		   alist.add(2,"e");
		   System.out.println(alist.size());
		   System.out.println(alist.contains("b"));
		   System.out.println(alist.indexOf("m"));
		   alist.remove("e");
		   Collections.sort(alist);
		   System.out.println(alist);
		   alist.clear();
		   System.out.println(alist);

	       for(String i:alist) {
	    	   System.out.println(i);
	       }
		}

	}
