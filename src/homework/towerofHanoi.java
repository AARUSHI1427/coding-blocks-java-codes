package homework;

import java.util.Scanner;

public class towerofHanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s=new Scanner(System.in);
       int N=s.nextInt();
       System.out.println(toHanoi("T1","T2","T3",N));
       
	}
	public static int toHanoi(String src,String des,String help,int n){
		if(n==1){
			System.out.println("Move "+n+"th disc from " +src+ " to " +des);
			return 1;
		}
		int count=1;
		count+=toHanoi(src, help, des, n-1);
		System.out.println("Move "+n+"th disc from " +src+ " to " +des);
		count+=toHanoi(help, des, src, n-1);
		return count;
	}

}
