package Day3;
public class Variables { 
	int b=20;
    static int c=30;
	public static void main(String[] args) {
     Variables obj=new Variables();
     int a=10;
     obj.b=25;
     System.out.println(a);
     System.out.println(c);
     System.out.println(obj.b);
     obj.show();
     c=100;
     display();
     
	}
	void show() {
		System.out.println("this:"+b);
		System.out.println(c);
	}
    static void display() {
    	System.out.println(c);
    }
}
