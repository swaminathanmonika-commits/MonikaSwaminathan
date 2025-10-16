package CollectionConcept;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Typesofset {

	public static void main(String[] args) {
		Set<String> st=new LinkedHashSet<>();
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
