package homework;

import java.util.Scanner;

public class AAA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s=new Scanner(System.in);
      String str=s.next();
      int[] count={0};
      int[] count1={0};
      System.out.println(check(str,0,count));
      System.out.println(check2(str,0,count1));

	}
 public static int check(String str,int i,int[] count){
	if(i==str.length()-2){
		return count[0];
	
	}
	if(str.charAt(i)==str.charAt(i+1)){
		if(str.charAt(i+1)==str.charAt(i+2)){
			count[0]++;
			check(str,i+1,count);
			
			return count[0];
		}else{
			return check(str,i+1,count);
		}
	}else{
		return check(str,i+1,count);
	}
}
 public static int check2(String str,int i,int[] count){
	 if(i==str.length()-2){
			return count[0];
		
		}
		if(str.charAt(i)==str.charAt(i+1)){
			if(str.charAt(i+1)==str.charAt(i+2)){
				count[0]++;
				check(str,i+3,count);
				
				return count[0];
			}else{
				return check(str,i+2,count);
			}
		}else{
			return check(str,i+1,count);
		}
 }
}
