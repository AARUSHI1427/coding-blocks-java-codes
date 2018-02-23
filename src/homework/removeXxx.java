package homework;

import java.util.Scanner;

public class removeXxx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s=new Scanner(System.in);
       String str=s.next();
       System.out.println(func(str,0));
       
	}
	public static String func(String str,int i){
		StringBuilder sb=new StringBuilder(str);
		if(i==str.length()-1){
			return str;
		}
		
		if(str.charAt(i)=='x'){
			sb.deleteCharAt(i);
			sb.insert(str.length()-1, 'x');
			str=sb.toString();
			return func(str,i+1);
		}else{
			return func(str,i+1);
		}
	}

}
