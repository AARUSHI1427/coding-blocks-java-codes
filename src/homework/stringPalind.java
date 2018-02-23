package homework;

import java.util.Scanner;

public class stringPalind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner s=new Scanner(System.in);
   String str=s.next();
   System.out.println(isPalind(str));
	}
	public static boolean isPalind(String str){
		int left=0;
		int right=str.length()-1;
		while(left<=right){
			if(str.charAt(left)==str.charAt(right)){
			  left++;
			  right--;
			}else{
				return false;
			}
		}
		return true;
	}

}
