package lecture4;

import java.util.Scanner;

public class twodArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int[][] arr=takeInput();
		// display(arr);
		int[][] arr = { { 11, 12, 13, 14 }, { 21, 22, 23, 24 }, { 31, 32, 33, 34 }, { 41, 42, 43, 44 } };
		// displaywave(arr);
		displaySpiral(arr);
	}

	public static int[][] takeInput() {
		Scanner s = new Scanner(System.in);
		int arr[][];
		System.out.println("Enter the no of rows");
		int rows = s.nextInt();
		arr = new int[rows][];
		for (int row = 0; row < arr.length; row++) {
			System.out.println("Enter the no. of columns for row" + rows);
			int cols = s.nextInt();
			arr[row] = new int[cols];
			for (int col = 0; col < arr[row].length; col++) {
				System.out.println("enter the value for row" + rows + "and column" + col);
				arr[row][col] = s.nextInt();
			}

		}
		return arr;
	}

	public static void display(int[][] arr) {
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				System.out.println(arr[row][col] + " ");

			}
			System.out.println();
		}
	}

	public static void displaywave(int[][] arr) {
		for (int row = 0; row < arr.length; row++) {
			if (row % 2 == 0) {
				for (int col = 0; col < arr[row].length; col++) {
					System.out.print(arr[row][col] + " ");
				}
				System.out.println();
			} else {
				for (int col = arr[row].length - 1; col >= 0; col--) {
					System.out.print(arr[row][col] + " ");
				}
				System.out.println();
			}
		}

	}

	public static void displaySpiral(int[][] arr) {
		int left = 0, top = 0, bottom = arr.length - 1, right = arr[top].length - 1;
		int dir = 1;
		int count = (bottom + 1) * (right + 1);
		while (top <= bottom && left <= right) {
			if (count > 0) {
				if (dir == 1) {
					for (int i = left; i <= right; i++) {
						System.out.println(arr[top][i] + ",");
						count--;
					}
					dir = 2;
					top++;
				}
			}
			
			if (count > 0) {
				if (dir == 2) {
					for (int i = top; i <= bottom; i++) {
						System.out.println(arr[i][right] + ",");
						count--;
					}
					dir = 3;
					right--;
				}
			}
			
			if (count > 0) {
				if (dir == 3) {
					for (int i = right; i >=left; i--) {
						System.out.println(arr[bottom][i] + ",");
						count--;
					}
					dir = 4;
					bottom--;
				}
			}
			
			if (count > 0) {
				if (dir == 4) {
					for (int i = bottom; i <= left; i--) {
						System.out.println(arr[i][left] + ",");
						count--;
					}
					dir=1;
					left++;
				}
			}
			
		}
		System.out.println("END");

	}
}
