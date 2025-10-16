package CollectionConcept;
import java.util.Queue;
import java.util.Comparator;
import java.util.PriorityQueue;
public class ArrayListprgm {
	public static void main(String[] args) {
		Queue<Character> q=new PriorityQueue<>();
		PriorityQueue<Character> pq=new PriorityQueue<>((a,b) -> b-a);
		q.add('x');
		q.add('1');
		q.offer('c');
		q.add('6');
		q.add('h');
		pq.addAll(q);
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq.poll());
	}
}