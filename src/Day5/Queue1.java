package Day5;

import java.util.Queue;
import java.util.PriorityQueue;

public class Queue1 {
	public static void main(String[] args) {
	Queue<String> list=new PriorityQueue<>();
    list.add("Monika");
    list.add("Moni");
    list.add("Nathis");
    System.out.println(list.contains("Moni"));
    System.out.println(list.isEmpty());
    System.out.println(list.toString());
    System.out.println(list);
}
}
