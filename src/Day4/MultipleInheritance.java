package Day4;
interface A2{
	void show1();
}
class B2{
	void show2() {
		System.out.println("B2-show2");
	}
}
class C2 extends B2 implements A2{
	public void show1() {
		System.out.println("C2-show1");
		}
	void show3() {
		System.out.println("C2-show3");
	}
}
public class MultipleInheritance {

	public static void main(String[] args) {
		C2 obj=new C2();
		obj.show1();
		obj.show2();
		obj.show3();

	}

}
