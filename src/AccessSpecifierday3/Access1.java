package AccessSpecifierday3;

public class Access1 {
  public void show1() {
	  System.out.println("H");
  }
  protected void show2(){
	  System.out.println("E");
  }
  private void show3() {
	  System.out.println("O");
  }
  void show4() {
	  System.out.println("LL");
	  show3();
  }
}
