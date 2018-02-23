package homework;

import java.util.Scanner;

public class insAsci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s=new Scanner(System.in);
	        String S=s.next();
	        System.out.println(insAsci(S));
	    }
	    public static String insAsci(String s){
	        StringBuilder sb=new StringBuilder();
	        for(int i=0;i<s.length()-1;i++){
	            int diff=s.charAt(i+1)-s.charAt(i);
	            sb.append(s.charAt(i));
	            sb.append(diff);
	        }
	        sb.append(s.charAt(s.length()-1));
	        return sb.toString();
	}

}
