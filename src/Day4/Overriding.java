package Day4;
class insta{
	void profile() {
		System.out.println("Bio");
		System.out.println("post");
		System.out.println("Highlights");
	}
}
class updatedInsta extends insta{
	@Override
	void profile(){
		super.profile();
		System.out.println("profile pic");
		System.out.println("followers list");
		}
}
public class Overriding {
public static void main(String[] args) {
     updatedInsta obj=new updatedInsta();
     obj.profile();
	}
}
