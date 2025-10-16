package CollectionConcept;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Scanner;
public class ArraySize {
public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		ArrayList<String> arr=new ArrayList<>();
		arr.add("ECE");
		arr.add("CSE");
		arr.add("IT");
		int size=arr.size();
			if(arr.isEmpty()) {
				for(int i=0;i<4;i++) {
					String st=s.nextLine();
					arr.add(st);
			}
				System.out.println(arr);
		}else if(size%2==0) {
			for(int i=0;i<size;i++) {
				
			}
			}
		if(size==2) {
			System.out.println(size*2);;
		}
		System.out.println(arr);
		}
}    
