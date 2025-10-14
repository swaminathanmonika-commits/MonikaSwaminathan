package Whileloop;

public class Amstrong {
      public static void main(String[] args) {
		int num=154;
        int temp=num;
        int len=0;
        while(num!=0) {
        	len++;
        	num/=10;
        }
        num=temp;
        int sum=0;
        while(num!=0) {
        	int last=num%10;
            int pow=1;
            for(int i=1;i<=len;i++) {
            	pow=pow*last;
            }
            sum=sum+pow;
            num/=10;
        }
        if(temp==sum) {
            System.out.println(" amstrong number");
        }
        else {
        	System.out.println("Not");
        }
      }
}
            
       