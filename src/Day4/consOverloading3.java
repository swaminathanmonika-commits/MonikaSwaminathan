package Day4;
class G{
	G(int a,int b) {
		System.out.println("111");
	}
	G(int a){
		System.out.println("222");
	}
}
public class consOverloading3 {

	public static void main(String[] args) {
    G obj=new G(1,2);
    G obj1=new G(1);
	}

}
