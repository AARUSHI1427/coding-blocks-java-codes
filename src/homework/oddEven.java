package homework;

import java.util.Scanner;

public class oddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s=new Scanner(System.in);
	        String S=s.next();
	        System.out.println(oddEven(S));
	        
	    }
	    public static String oddEven(String str){
	    	StringBuilder sb=new StringBuilder(str);
	        for(int i=0;i<str.length();i++){
	            if(i%2==0){
	            	sb.setCharAt(i,(char)(str.charAt(i)+1));
	            }else{
	            	sb.setCharAt(i,(char)(str.charAt(i)-1));
	            }
	        }
	    	return sb.toString();
	}

}
