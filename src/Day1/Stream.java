package Day1;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class Stream {
  public static void main(String[] args) {
	List<String> list=Arrays.asList("Java","c","c++","python");
	List<String> data= (List<String>) list.stream()
			.skip(0)
			.distinct()
			.sorted()
			.limit(3)
			.map(n->n+".")
			.collect(Collectors.toList());
	for(String i:data) {
		System.out.println(i);
	}
}
}
