package Day3;
public class Task2 {
static int a=10;
static int b=20;
int c=30;
int d=40;
	public static void main(String[] args) {
		Task2 obj=new Task2();
		System.out.println(obj.c);
		System.out.println(obj.d);
		System.out.println(a);
		System.out.println(b);	
		obj.show();
		}
void show()
{
	Task2 obj=new Task2();
     System.out.println();
    System.out.println("show:"+a);
	System.out.println("show:"+c);
	System.out.println("show:"+b);
	System.out.println("show:"+d);
	
	display();
	
	}
void display() {
	Task2 obj=new Task2();
	System.out.println();
    System.out.println("display:"+a);
	System.out.println("display:"+b);
	System.out.println("display:"+c);
	System.out.println("display:"+d);
	obj.showinfo();
	
}
static void showinfo() {
	Task2 obj=new Task2();
    System.out.println();
	System.out.println("show2:"+a);
	System.out.println("show2:"+obj.c);
	System.out.println("show2:"+b);
	System.out.println("show2:"+obj.d);
	obj.displayinfo();
	
}
static void displayinfo() {
	Task2 obj=new Task2();
	System.out.println();
    System.out.println("display2:"+a);
    System.out.println("display2:"+b);
    System.out.println("display2:"+obj.c);
    System.out.println("display2:"+obj.d);
}
}
