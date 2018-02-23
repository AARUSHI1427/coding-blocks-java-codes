package Lecture3;

import java.util.Scanner;

public class binarySear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20,30,40,50,60};
		
		display(arr);
		System.out.println(binSear(arr,25));
	}

//	public static int[] takeInput() {
//		Scanner s = new Scanner(System.in);
//		int[] arr;
//		System.out.println("Enter the size pf the array");
//		int n = s.nextInt();
//		arr = new int[n];
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println("enter the value at index" + i);
//			arr[i] = s.nextInt();
//		}
//		return arr;
//	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	public static int binSear(int[] arr,int data){
		int left=0;
		int right=arr.length-1;
		while(left<=right){
			int mid=(left+right)/2;
			if(arr[mid]==data){
				return mid;
			}else if(arr[mid]>data){
				right=mid-1;
			}else{
				left=mid+1;
			}
		}
		return -1;
	}
}


