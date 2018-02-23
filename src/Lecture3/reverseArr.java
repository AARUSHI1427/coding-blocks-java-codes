package Lecture3;

import java.util.Scanner;

public class reverseArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr;
		arr = takeInput();
		display(arr);
		System.out.println("Reversed array is: "+reverse(arr));
	}

	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int[] arr;
		System.out.println("Enter the size pf the array");
		int n = s.nextInt();a
		arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("enter the value at index" + i);
			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	public static int[] reverse(int[] arr){
		
	}
}
