package homework;

import java.util.Scanner;

public class stringCompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s=new Scanner(System.in);
      String S=s.next();
      System.out.println(stringCompress(S,0));
	}
	public static String stringCompress(String str,int j){
		String s="";
		StringBuilder sb= new StringBuilder(s);
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)!=str.charAt(i+1)){
				sb.insert(i,str.charAt(i));
				sb.insert(i+1,str.charAt(i+1));
			}else{
				sb.append(s.charAt(i));
			}
		}
		System.out.println(sb.toString());
		int k=0,count=0;
		while(k<str.length()){
			if(str.charAt(k)==str.charAt(k+1)){
				count++;
				sb.insert(k+1, count);
				k++;
			}else{
				count=0;
				k++;
			}
		}
		return sb.toString();
	}

}
