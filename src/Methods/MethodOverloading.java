package Methods;

public class MethodOverloading {
	void sum(int num1,int num2) {
		System.out.println(+num2);
	}
	void sum(int num1,float num2) {
		System.out.println(num1+num2);
	}
	void sum(float num1,int num2) {
		System.out.println(num1+num2);
	}

	public static void main(String[] args) {
		MethodOverloading s=new MethodOverloading();
		s.sum(2,3);
		s.sum(1, 2.0f);
		s.sum(2,1);
		

	}

}
