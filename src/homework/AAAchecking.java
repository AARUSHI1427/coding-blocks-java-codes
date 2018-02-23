package homework;

import java.util.Scanner;

public class AAAchecking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
	       String str=s.next();
	       System.out.println(func1(str,0,0));
	       System.out.println(func2(str,0,0));
	    }
	    public static int func1(String str,int i,int count){
	        if(i==str.length()-2){
	            return count;
	        }
	        if(str.charAt(i)==str.charAt(i+2)){
	            return func1(str,i+1,count+1);
	        }else{
	            return func1(str,i+1,count);
	        }
	    }
	     public static int func2(String str,int i,int count){
	        if(i>=str.length()-3){
	        	if(i==str.length()){
	        		if(str.charAt(i)==str.charAt(i+2)){
		        		return func2(str,i+3,count+1);
		        	}
	        	}else{
		        	return count;
		        }
	        }
	       
	        if(str.charAt(i)==str.charAt(i+2)){
	            return func2(str,i+3,count+1);
	        }else{
	            return func2(str,i+3,count);
	        }
	}

}
