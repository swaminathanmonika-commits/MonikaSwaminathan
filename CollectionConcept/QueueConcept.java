package CollectionConcept;
 import java.util.LinkedList;
 import java.util.Queue;

public class QueueConcept {

	public static void main(String[] args) {
		Queue<String> q=new LinkedList<>();
		q.add("swetha");
		q.add("pragi");
		q.add("hari");
		q.add("deepa");
		q.add("moni");
		q.add("dheek");
		q.add("vars");
		q.add("sar");
		System.out.println(q);
		System.out.println("poll element:"+q.poll());
		System.out.println(q);
		System.out.println("peek element:"+q.peek());
		System.out.println(q);
		System.out.println("size:"+q.size());
		System.out.println("Empty check"+q.isEmpty());
		q.clear();
		System.out.println(q);
		
	}

}
