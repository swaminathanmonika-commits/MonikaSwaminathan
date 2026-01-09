package Day1;
interface car{
	void tire();
	void engine();
}
class Audi1 implements car{
	public void engine() {
		System.out.println("5000cc");
	}
	public void tire() {
		System.out.println("22 inch");
	}
	public void airbag() {
		System.out.println("2 airbag");
	}
}

class Audi2 implements car{
	public void engine() {
		System.out.println("4000cc");
	}
	public void tire() {
		System.out.println("25 inch");
	}
}
public class Sample {

	public static void main(String[] args) {
		System.out.println("Audi1:");
		Audi1 a1=new Audi1();
		a1.engine();
		a1.tire();
		a1.airbag();
		
	    System.out.println("\nAudi2:");
		Audi2 a2=new Audi2();
		a2.engine();
		a2.tire();
	}

}
