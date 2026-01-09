package Day2;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FileUpdate {

	public static void main(String[] args) {
		String pre="";
   try {
	   File obj=new File("D:\\New folder\\folder.txt");
	   Scanner sc=new Scanner(obj);
	   while(sc.hasNextLine()){
		   String data=sc.nextLine();
		   pre+=data;
		   
	   }
	   FileWriter fw=new FileWriter(obj);
	   fw.write(pre);
	   String s="Welcome";
	   fw.write(s);
	   fw.close();
	   
   }catch(Exception e) {
	   e.printStackTrace();
   }
	}

}
