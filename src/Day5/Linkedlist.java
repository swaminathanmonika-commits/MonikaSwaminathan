package Day5;

import java.util.LinkedList;
public class Linkedlist {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<>();
		list.add("Monika");
	    list.add("Moni");
	    list.add("Nathis");
	    System.out.println(list.contains("Moni"));
	    System.out.println(list.isEmpty());
	    System.out.println(list.toString());
	    System.out.println(list);
	    
	}

}
