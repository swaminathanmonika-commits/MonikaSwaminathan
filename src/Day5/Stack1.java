package Day5;
import java.util.Stack;
public class Stack1 {

	public static void main(String[] args) {
        Stack<String> list=new Stack<>();
        list.push("Monika");
        list.push("Moni");
        list.peek();
        list.pop();
        System.out.println(list);
	}

}
