package Lecture3;

import java.util.Scanner;

public class linearSearArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr;
		arr = takeInput();
		display(arr);
		System.out.println("result: "+linear(arr,3));
	}

	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int[] arr;
		System.out.println("Enter the size pf the array");
		int n = s.nextInt();
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
	public static int linear(int arr[],int num){
		int k=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==num){
				k=1;
				return i;
				
			}
		}
		if(k==0){
			System.out.println("not found");
		}
		return 0;
	}
}


