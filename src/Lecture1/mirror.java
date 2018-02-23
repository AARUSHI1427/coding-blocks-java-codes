package Lecture1;

import java.util.Scanner;

public class mirror {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row = 1, col = 1;
		Scanner s=new Scanner(System.in);
		int n = s.nextInt();
		int nsp = n/2, nstars = 1;
		while (row <=  n ) {
			col = 1;
			while (col <= nsp) {
				System.out.print(" ");
				col++;
			}
			col = 1;
			while (col <= nstars) {
				System.out.print("*");
				col++;
			}
			if (row <= n/2) {
				nsp = nsp - 1;
				nstars = nstars + 2;
			} else {
				nsp = nsp + 1;
				nstars = nstars - 2;
			}
			System.out.println();
			row++;
		}

	}

}
