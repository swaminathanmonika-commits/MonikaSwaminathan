package CollectionConcept;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapIteration {

	public static void main(String[] args) {
		LinkedHashMap<Character,Integer> q=new LinkedHashMap<>();
		q.put('v', 1);
		q.put('e', 2);
		q.put('u', 3);
		q.put('i', 4);
		q.put('h', 5);
		for(char ch:q.keySet()) {
			System.out.println(ch+" : "+q.get(ch));
		}
		for(int i:q.values()) {
			System.out.println(i);
		}
		for(Map.Entry<Character,Integer> it : q.entrySet());
		 System.out.println(it.getKey()+" : "+it.getValue());
		
	}

}
