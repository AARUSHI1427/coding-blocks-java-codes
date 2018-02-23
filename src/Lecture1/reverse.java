package Lecture1;

import java.util.Scanner;

public class reverse {
	public static void main(String[] args) {
		// TODO Auto-generated method stub}
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int n=s.nextInt();
		int rem=0;
		while(n!=0){
			
		rem=n%10;
		System.out.println(rem);
		n=n/10;
		
		
		}
			
		}
}
