package Day4;
class C{
	void show(int a) {
		System.out.println("111");
		}
	void show(int a,int b) {
		System.out.println("222");
	}
}
public class Overloadingtype3 {

	public static void main(String[] args) {
		C obj=new C();
		obj.show(7);
		obj.show(2,2);

	}

}
