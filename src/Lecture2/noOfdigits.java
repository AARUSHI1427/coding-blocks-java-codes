package Lecture2;

import java.util.Scanner;

public class noOfdigits {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int digit=s.nextInt();
		int i=1,sum=0;
		while(N!=0){
			int rem=N%10;
			if(rem==digit){
			 sum=sum+1;
			}
			
			N=N/10;
		}
		System.out.println(sum);
	}
}
