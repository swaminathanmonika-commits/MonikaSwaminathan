package Day5;
class A extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(100);
			}catch(InterruptedException e) {
				System.out.println(e);
			}
			System.out.println("Hi!");
		}
	}
}
class B extends Thread{
	public void run() {
		try {
			Thread.sleep(100);
		}catch(InterruptedException e) {
			System.out.println(e);
		}
		for(int i=0;i<5;i++) {
			System.out.println("Hello!");
		}
	}
}
public class MultiThread {
public static void main(String[] args) {
Thread t1=new A();
Thread t2=new B();
t1.start();
t2.start();
	}

}
