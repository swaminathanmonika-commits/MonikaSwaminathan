package Day4;
class F{
	F(int a,int b) {
		System.out.println("111");
	}
	F(double a,double b){
		System.out.println("222");
	}
}
public class Consoverloading2 {

	public static void main(String[] args) {
    F obj=new F(1,2);
    F obj1=new F(1.2,2.3);
    
	}

}
