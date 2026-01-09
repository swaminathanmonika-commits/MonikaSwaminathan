package Day1;

import java.util.Arrays;
import java.util.List;
public class Streamtask {
public static void main(String[] args) {
	List<Integer> list=Arrays.asList(20000,80000,90000,50000,65000);
    list.stream()
    .filter(n->n>50000)
    .map( n->(n/10)+n)
    .forEach(n->System.out.println(n));
    
    
	}

}
