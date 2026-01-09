package Day3;
import Day4.Encapsulation;
public class Main {

	public static void main(String[] args) {
    Encapsulation obj=new Encapsulation();
    obj.setUser("Monika");
    obj.setPass("123");
    obj.setBio("Happy");
    obj.setAge(20);
    System.out.println(obj.getUser());
    System.out.println(obj.getpass());
    System.out.println(obj.getBio());
    System.out.println(obj.getAge());
    
    
    
    
	}

}
