package Day5;
import java.util.Hashtable;
public class HashTable {
	public static void main(String[] args) {
    Hashtable<String,String> hm=new Hashtable<>();
    hm.put("5", "aaa");
    hm.put("4","bbb");
    hm.put("2","ccc");
    hm.put("1","eee");
    hm.put("3","ddd");
    System.out.println(hm.keySet());
    System.out.println(hm.values());
    System.out.println(hm.get("2"));
    hm.replace("3","hhh");
    hm.remove("1");
    System.out.println(hm);
    
	}

}
