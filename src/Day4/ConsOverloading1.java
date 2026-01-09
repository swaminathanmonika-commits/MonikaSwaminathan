package Day4;
class E{
	E(int a) {
		System.out.println("111");
	}
	E(){
		System.out.println("222");
	}
}
public class ConsOverloading1 {

	public static void main(String[] args) {
		E obj=new E(2);
		E obj1=new E();

	}

}
