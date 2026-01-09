package Day4;

	class A{
		void show(int a) {
			System.out.println("111");
		}
		void show() {
			System.out.println("222");
		}
	}
public class Overloadingtype1 {
public static void main(String[] args) {
		A obj=new A();
		obj.show();
		obj.show(7);

	}

}
