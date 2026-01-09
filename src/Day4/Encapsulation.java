package Day4;

public class Encapsulation {
    private String user;
    private String pass;
    private String bio;
    private int age;
    
    public void setUser(String user) {
    	this.user=user;
    }
    public void setPass(String pass) {
    	this.pass=pass;
    }
    public void setBio(String bio) {
    	this.bio=bio;
    }
    public void setAge (int age){
    	this.age=age;
    }
    public String getUser() {
    	return user;
    }
    public String getpass() {
    	return pass;
    }
    public String getBio() {
    	return bio;
    }
    public int getAge() {
    	return age;
    }
	@Override
	public String toString() {
		return "Encapsulation [user=" + user + ", pass=" + pass + "]";
	}
    
}
