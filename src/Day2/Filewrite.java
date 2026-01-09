package Day2;

import java.io.File;
import java.io.FileWriter;

public class Filewrite {

	public static void main(String[] args) {
		try {
	    	FileWriter obj=new FileWriter("D:\\New folder\\folder.txt");
	    	String str="Hello!This is me";
	    	obj.write(str);
	    	obj.close();
	    	  System.out.println("successfull");
       }catch(Exception e) {
    	   e.printStackTrace();
       }

}
}
