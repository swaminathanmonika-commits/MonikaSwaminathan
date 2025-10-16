package CollectionConcept;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
public class Methods {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		LinkedList<Integer> ll=new LinkedList<>();
		ll.add(2);
		ll.add(39);
		ll.add(59);
		ll.add(7);
		ll.add(15);
		ll.add(72);
		ll.addFirst(0);
		ll.addLast(1);
		ll.add(1,1);
		System.out.println(11);
		ll.remove();
		System.out.println("after remove () :"+ll);
		ll.removeLast();
		System.out.println("after removelast () :"+ll);
		ll.remove(2);
		System.out.println("after remove(index) :"+ll);
		ll.removefirstoccurrence(o:2);
		System.out.println("after removefirstoccurance(2) :" +ll);
		ll.removeLastOccurence(o:2);
		System.out.println("After removeLastOccurence(2):"+ll);
		System.out.println("size:"+ll.size());
		System.out.println("isempty:"+ll.isEmpty());
		System.out.println("Indexof():"+ll.indexOf(o:59));
		ll.clear();
		System.out.println("clear:"+ll);
		
		
		
			

	}

}
