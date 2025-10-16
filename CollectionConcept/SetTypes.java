package CollectionConcept;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
public class SetTypes {

	public static void main(String[] args) {
		Set<String> st=new TreeSet<>();
		st.add("swetha");
		st.add("pragi");
		st.add("hari");
		st.add("deepa");
		st.add("moni");
		st.add("dheek");
		st.add("vars");
		st.add("sar");
		System.out.println(st);
		System.out.println(st.size());
		System.out.println(st.contains("moni"));
		st.remove("moni");
		System.out.println(st);

	}

}
