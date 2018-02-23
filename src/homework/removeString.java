package homework;

import java.util.Scanner;

public class removeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String S = s.next();
		System.out.println(remove(S));
	}

	public static String remove(String str) {
	
		StringBuilder sb = new StringBuilder(str);
		for (int i = 0; i < str.length()-1; i++) {
			if (str.charAt(i) == str.charAt(i + 1)) {
				sb.deleteCharAt(i + 1);
				str=sb.toString();
				
			}
		}
		return sb.toString();
	}

}
