package CollectionConcept;
import java.util.Map;
import java.util.HashMap;
public class Mapping {
	public static void main(String[] args) {
		Map<Integer,String> m=new HashMap<>();
	m.put(0,"HashSet");
	m.put(1,"TreeSet");
	m.put(2,"LinkedHashSet");
	System.out.println(m);
	System.out.println(m.get(0));
	System.out.println(m.size());
	System.out.println(m.containsKey(1));
	System.out.println(m.containsValue("Set"));
	}
}
