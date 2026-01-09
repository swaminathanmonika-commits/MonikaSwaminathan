package Day5;
import java.util.ArrayList;
public class Collection {
   public static void main(String[] args) {
	   ArrayList<Integer> alist=new ArrayList<>();
	   alist.add(10);
	   alist.add(20);
	   alist.add(30);
	   alist.add(40);
	   alist.add(50);
	   System.out.println(alist.get(0));
       for(int i:alist) {
    	   System.out.println(i);
       }
	}

}
