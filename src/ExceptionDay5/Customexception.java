package ExceptionDay5;
class InvalidAgeException extends Exception{
	InvalidAgeException(String message){
		super(message);
	}
}
public class Customexception{
	 static void valid(int age)throws InvalidAgeException {
	if (age<18) {
		throw new InvalidAgeException("Age must be 18");
	}else {
		System.out.println("Eligible");
	}
}
public static void main(String[]args) {
	try {
		valid(22);
	}catch(InvalidAgeException e) {
		System.out.println(e.getMessage());
	}
}
}