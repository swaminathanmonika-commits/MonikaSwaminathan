package Day5;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;
public class Task3 {
	public static void main(String[] args) {
    LinkedList<Integer> list=new LinkedList<>();
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	for(int i=0;i<n;i++) {
    if(n<0){
    	if((n/n==1) || (n*1==n)) {
    		System.out.println(n);
    		list.add(n);
    	}
    }
	}
   System.out.println(list);
	}

}
