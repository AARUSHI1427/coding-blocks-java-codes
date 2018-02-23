package homework;

import java.util.Scanner;

public class getSS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s=new Scanner(System.in);
       String str=s.next();
       System.out.println(getcount(str));
       getSS(str,"");
       
	}
	public static int getcount(String str){
		int len=str.length();
		int count1=Power(2,len);
		return count1;
	}
	public static int Power(int base, int power) {
		int result = 1;
		for (int i = 1; i <= power; i++) {
			if (power == 0) {
				return 1;
			} else {
				result = result * base;
			}
			
			}
		return (result);
		}
	public static void getSS(String str,String result){
		if (str.length() == 0) {
			System.out.println(result);
			return;
		}
		char cc = str.charAt(0);
		String ros = str.substring(1);

		getSS(ros, result);
		getSS(ros, result + cc);
	}

}
