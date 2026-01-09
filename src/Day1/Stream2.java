package Day1;

import java.util.Arrays;
import java.util.List;

public class Stream2 {
public static void main(String[] args) {
	List<Integer> list=Arrays.asList(23,33,83,87,93,109,115);
    list.stream()
			.skip(0)
			.distinct()
			.sorted()
			.limit(3)
			.filter(n->n>80)
			.map(n->n+7)
          .forEach(n->System.out.println(n));
	}
	}

