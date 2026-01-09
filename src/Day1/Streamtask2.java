package Day1;

import java.util.Arrays;
import java.util.List;

public class Streamtask2 {

	public static void main(String[] args) {
		List<String> list=Arrays.asList("Java","c","c++","python");
		list.stream()
				.filter(n->n.length()<4)
				.forEach(n->System.out.println(n));

	}

}
