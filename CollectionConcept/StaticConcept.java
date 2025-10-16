package CollectionConcept;
import java.util.Stack;
public class StaticConcept {
	public static void main(String[] args) {
		Stack<Integer>st=new Stack<>();
		st.push(25);
		st.push(17);
		st.push(22);
		st.push(3);
		st.push(88);
		st.pop();
		st.peek();
		System.out.println(st.size());
		System.out.println(st.empty());
		System.out.println("poped element:"+st.pop());
		System.out.println("after pop:"+st);
		System.out.println("after pop:"+st);
		System.out.println("peek element:"+st.peek());
		System.out.println("after element:"+st);
		System.out.println(st.size());
		System.out.println(st.empty());
		st.clear();
		System.out.println(st);
		System.out.println("Capacity:"+st.capacity());
		}
}
