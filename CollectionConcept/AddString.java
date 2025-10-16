package CollectionConcept;

import java.util.ArrayList;
import java.util.Scanner;

public class AddString {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		ArrayList<String> arr=new ArrayList<>();
		for(int i=0;i<5;i++) {
			System.out.println("Enter the String :");
			String str=s.nextLine();
			arr.add(str);
		}
		System.out.println(arr);

		}

	}