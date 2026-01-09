package Day4;
interface A1{
	void show1();
}
interface B1 extends A1{
	void show2();
}
class C1 implements A1{
	public void show1(){
		System.out.println("C-show1");
	}
}
class D1 extends C1 implements B1{
	public void show1() {
		super.show1();
		System.out.println("D-show1");
	}
	public void show2() {
		System.out.println("D-show2");
	}
}
public class HybridInheritance {

	public static void main(String[] args) {
		D1 obj=new D1();
		obj.show1();
		obj.show2();
		

	}

}
