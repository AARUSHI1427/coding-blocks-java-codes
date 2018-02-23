package homework;

import java.util.Scanner;

public class waveCol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 11, 12, 13, 14 }, { 21, 22, 23, 24 }, { 31, 32, 33, 34 }, { 41, 42, 43, 44 } };
		displaywave(arr);
				
			}

//			public static int[][] takeInput() {
//				Scanner s = new Scanner(System.in);
//				int arr[][];
//				System.out.println("Enter the no of rows");
//				int rows = s.nextInt();
//				arr = new int[rows][];
//				for (int row = 0; row < arr.length; row++) {
//					System.out.println("Enter the no. of columns for row" + rows);
//					int cols = s.nextInt();
//					arr[row] = new int[cols];
//					for (int col = 0; col < arr[row].length; col++) {
//						System.out.println("enter the value for row" + rows + "and column" + col);
//						arr[row][col] = s.nextInt();
//					}
//
//				}
//				return arr;
//			}

//			public static void display(int[][] arr) {
//				for (int row = 0; row < arr.length; row++) {
//					for (int col = 0; col < arr[row].length; col++) {
//						System.out.println(arr[row][col] + " ");
//
//					}
//					System.out.println();
//				}
//			}

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


