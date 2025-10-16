package CollectionConcept;
import java.util.LinkedHashMap;
public class FrequencyOfString {
	 public static void main(String[] args) {
	 String st="Velalar";
	 LinkedHashMap<Character,Integer> mp=new LinkedHashMap<>();
	 for(char ch:st.toCharArray()) {
		 if(mp.containsKey(ch)) {
			 mp.put(ch,mp.get(ch)+1);
		 }
		 else {
			 mp.put(ch,1);
     }

	}
System.out.println(mp);
}
}