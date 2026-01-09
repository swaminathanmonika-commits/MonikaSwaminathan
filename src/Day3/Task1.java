package Day3;

public class Task1 {
static int a=10;
static int b=20;
int c=30;
int d=40;
	public static void main(String[] args) {
		Task1 obj=new Task1();
		System.out.println(obj.c);
		System.out.println(obj.d);
		System.out.println(a);
		System.out.println(b);	
		obj.show();
		obj.display();
		showinfo();
		}
void show()
{
	System.out.println("\n");
    System.out.println("show:"+a);
	System.out.println("show:"+c);
	}
void display() {
	System.out.println("\n");
	
	System.out.println("display"+b);
	System.out.println("display"+d);
}
static void showinfo() {
	Task1 obj=new Task1();
	System.out.println("\n");

	System.out.println(a);
	System.out.println(obj.c);
}
static void displayinfo() {
	Task1 obj=new Task1();
	System.out.println("\n");

    System.out.println(b);
    System.out.println(obj.d);
}
}
