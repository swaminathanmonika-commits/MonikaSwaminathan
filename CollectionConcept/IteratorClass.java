package CollectionConcept;
import java.util.ArrayList;
import java.util.Iterator;
public class IteratorClass {

	public static void main(String[] args) {
		ArrayList<Integer> i=new ArrayList<>();
		i.add(1);
		i.add(16);
		i.add(7);
		i.add(8);
		i.add(10);
		i.add(6);
		System.out.println(i);
		Iterator<Integer> it=i.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		

	}

}
