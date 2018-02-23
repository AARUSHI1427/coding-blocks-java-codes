package Lecture1;

public class pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;

		int row = 1;
		int col = 1;
		while (row <= n) {
			col = 1;
			while (col <= n - row) {
				System.out.print("\t");

				col++;

			}
			col = 1;
			
			while (col <= row) {
				System.out.print("* \t");

				col++;
			}
			col = 1;

			while (col < row) {
				System.out.print("*\t");

				col++;
			}
			System.out.println();
			row++;
		}

	}

}
