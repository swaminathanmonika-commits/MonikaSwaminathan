package Day2;
import java.io.File;



public class FileDelete {

	public static void main(String[] args) {
     File obj=new File("D:\\New folder\\folder.txt");
     if(obj.delete()) {
    	 System.out.println("File is deleted");
     }else {
    	 System.out.println("there is a problem");
     }
	}

}
