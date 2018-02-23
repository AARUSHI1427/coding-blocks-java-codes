package Lecture1;

import java.util.Scanner;

public class inPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter no to be checked: ");
		int n = s.nextInt();
		int i,k=0;
		for (i = 2; i < n; i++) {
			if (n % i == 0) {
				k=1;
				System.out.println("No. is not prime");
				
				break;
			}
			
		}
		if(k==0){
		System.out.println("No. is  prime");
		}
       
	}

}
