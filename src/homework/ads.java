package homework;

import java.util.Scanner;

public class ads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int arr[][];
		int rows = s.nextInt();
		int cols = s.nextInt();
		arr = new int[rows][cols];
        for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				arr[row][col] = s.nextInt();
			}

		}
		displaywave(arr);
		
    }
    public static void displaywave(int[][] arr) {
		for (int col = 0; col < arr.length; col++) {
					if (col % 2 == 0) {
						for (int row = 0; row < arr[col].length; row++) {
							System.out.print(arr[row][col] + ", ");
						}
						
					} else {
						for (int row = arr[col].length - 1; row >= 0; row--) {
							System.out.print(arr[row][col] + ", ");
						}
						
					}
				}
				System.out.println("END");

	}

}
