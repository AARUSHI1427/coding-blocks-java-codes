package homework;

import java.util.Scanner;

public class sumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
	     String str=s.next();
	     System.out.println(Convert(str,0,0));
	}
	public static int Convert(String str,int i, int sum){
		if(i==str.length()){
			return sum;
		}
		char cc=str.charAt(i);
		
		int conv=cc-48;
		sum=sum+conv;
		System.out.println(sum);
		return Convert(str,i+1,sum);
	}

}
