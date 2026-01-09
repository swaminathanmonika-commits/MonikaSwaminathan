package Day4;
class D{
	void show(int a,double b) {
		System.out.println("111");
	}
	void show(double a,int b) {
		System.out.println("222");
	}
}
public class Overloadingtype4 {

	public static void main(String[] args) {
		D obj=new D();
		obj.show(7, 1.2);
		obj.show(1.2, 7);

	}

}
