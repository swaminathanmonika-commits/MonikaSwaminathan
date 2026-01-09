package Day1;

import java.util.Arrays;
import java.util.List;

public class Streamtask3 {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(20,33,83,88,93,10
				
				
				,115);
		int sum=list.stream()
				.filter(n->n%2==0)
				.reduce(0, (a,b)->a+b);
				System.out.println(sum);
	}

}
