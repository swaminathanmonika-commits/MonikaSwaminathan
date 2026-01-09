package Day4;
class B{
	void show(int a,int b) {
		System.out.println("111");
	}
	void show(float a,float b) {
		System.out.println("222");
	}
}
public class Overloadingtype2 {

	public static void main(String[] args) {
      B obj=new B();
      obj.show(1, 2);
      obj.show(1.0f,2.0f);
	}
}
