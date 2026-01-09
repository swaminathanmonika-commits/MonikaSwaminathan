package Day2;

import java.io.File;

public class FileCreate {

	public static void main(String[] args) {
    try {
    	File obj=new File("D:\\New folder\\folder1.txt");
    	if(obj.createNewFile()) {
    		System.out.println("File is created");
    		}else {
    			System.out.println("File is already exists");
    		}
    }catch(Exception e) {
    	System.out.println("no path detected");
    }
	}

}