package Day2;
import java.io.File;
import java.util.Scanner;
public class Fileread {

	public static void main(String[] args) {
    try {
    	File obj=new File("D:\\New folder\\folder.txt");
    	Scanner s=new Scanner(obj);
    	while(s.hasNextLine()){
    		String data=s.nextLine();
    		System.out.println(data);
    	}
    }catch(Exception e) {
    	e.printStackTrace();
    }
	}

}
