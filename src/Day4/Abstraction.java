package Day4;
abstract class Audi{
	abstract void engine();
	abstract void tyre();
	void body() {
		System.out.println("Steel");
	}
}
class Audi1 extends Audi{
	public void engine() {
		System.out.println("5000cc");
	}
	public void tyre() {
		System.out.println("22inch");
	}
}
class Audi2 extends Audi{
	public void engine() {
		System.out.println("5200cc");
	}
	public void tyre() {
		System.out.println("25inch");
	}
}
class AudiNew extends Audi{
	public void engine() {
		System.out.println("6800cc");
	}
	public void tyre() {
		System.out.println("28inch");
	}
	void body() {
		System.out.println("iron");
	}
	
}
public class Abstraction {

	public static void main(String[] args) {
		System.out.println("Audi1:");
		Audi2 A2=new Audi2();
		A2.engine();
		A2.tyre();
		A2.body();
		System.out.println();
		System.out.println("Audi2:");
		Audi1 A1=new Audi1();
		A1.engine();
		A1.tyre();
		A1.body();
		System.out.println();
		System.out.println("Audi New:");
		AudiNew New=new AudiNew();
		New.engine();
		New.tyre();
		New.body();

	}

}
