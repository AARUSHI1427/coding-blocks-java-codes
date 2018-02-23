package Lecture1;

public class pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row = 1, col = 1;
		int n = 5;
		int nsp = 0, nstars = n;
		while (row <= 2 * n - 1) {
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
			if (row < n) {
				nsp = nsp + 2;
				nstars = nstars - 1;
			} else {
				nsp = nsp - 2;
				nstars = nstars + 1;
			}
			System.out.println();
			row++;
		}

	}

}
