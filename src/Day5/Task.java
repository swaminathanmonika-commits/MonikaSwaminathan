package Day5;
class E extends Thread{
	public void run() {
		int a=2;
		int b=2;
		System.out.println(a*b);
	}
}
	

public class Task {
public static void main(String[] args) {
E obj=new E();
E obj1=new E();
obj.start();
obj1.start();



	}

}
