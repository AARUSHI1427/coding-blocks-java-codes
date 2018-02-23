package Lecture1;

import java.util.Scanner;

public class printprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter no to be checked: ");
		int N = s.nextInt();
		if(N>=1&&N<=1000){
		
			int i,j,k=0;
			for (i = 2; i < N; i++) {
				for(j=2;j<i;j++){
					if (i % j == 0) {
						k=1;
						
					}else{
						System.out.println(i);
					}
					
				}
				
			}
			
			
		}
		

		

	}

}
