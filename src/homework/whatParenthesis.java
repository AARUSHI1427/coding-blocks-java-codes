package homework;

import java.util.Scanner;

public class whatParenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner s=new Scanner(System.in);
         int[] arr=new int[2];
         String str=s.next();
         System.out.println(what(str,arr,0));
         
        		 
	}
	public static String what(String str,int[] arr,int i){
		if(i==str.length()){
			return "";
		}
		if(str.charAt(i)=='('){
			arr[0]=i;
			return what(str, arr, i+1);
		}else{
			if(str.charAt(i)==')'){
				arr[1]=i;
				return str.substring(arr[0]+1, arr[1]);
			}else{
				return what(str, arr, i+1);
			}
		}
	
		
	}

}
