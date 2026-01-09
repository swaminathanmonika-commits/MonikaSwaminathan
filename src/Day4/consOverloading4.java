package Day4;
class H{
	H(int a,float b) {
		System.out.println("111");
	}
	H(float a,int b){
		System.out.println("222");
	}
}
public class consOverloading4 {

	public static void main(String[] args) {
    H obj=new H(1,1.2f);
    H obj1=new H(1.2f,1);
	}

}
