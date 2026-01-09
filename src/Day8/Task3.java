package Day8;

public class Task3 {

	public static void main(String[] args) {
		  String s="jnEFNBownirw!#%`48976591JFBFMGAGnioe";
		  String lower="";
		  String upper="";
		  int num=0;
		  String special="";
		    for(int i=0;i<s.length();i++) {
		    	if(s.charAt(i)>='a'&&s.charAt(i)<='z') {
		    	lower+=s.charAt(i);
		    }
		    	else if(s.charAt(i)>='A'&&s.charAt(i)<='Z') {
		        	upper+=s.charAt(i);
		        }
		    	else if(s.charAt(i)>='0'&&s.charAt(i)<='9') {
		        	char ch=s.charAt(i);
		        	num+=Character.getNumericValue(ch);
		        	
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

