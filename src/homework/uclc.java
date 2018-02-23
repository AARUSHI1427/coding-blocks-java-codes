package homework;

import java.util.Scanner;

public class uclc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner s=new Scanner(System.in);
	       char ch=s.next().charAt(0);
	       System.out.println(check(ch));
	    }
	    public static char check(char c){
	        if(c>='a'&&c<='z')
	        return ('L');
	        
	        if(c>=65&&c<=90)
	         return ('U');
	         else
	        return('I');
	}

}
