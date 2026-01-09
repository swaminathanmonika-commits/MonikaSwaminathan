package Day8;
public class Task2 {
	public static void main(String[] args) {
    String s="CDnber@%!%%w1235@Q^%CNdo653!^)*(&@~4";
    String lower="";
    String upper="";
    String num="";
    String special="";
    for(int i=0;i<s.length();i++) {
    	if(s.charAt(i)>='a'&&s.charAt(i)<='z') {
    	lower+=s.charAt(i);
    }
    	else if(s.charAt(i)>='A'&&s.charAt(i)<='Z') {
        	upper+=s.charAt(i);
        }
    	else if(s.charAt(i)>='0'&&s.charAt(i)<='9') {
        	num+=s.charAt(i);
        }
    	else {
        	special+=s.charAt(i);
        }
	}
    System.out.println(lower);
    System.out.println(upper);
    System.out.println(num);
    System.out.println(special);
	}
	}
