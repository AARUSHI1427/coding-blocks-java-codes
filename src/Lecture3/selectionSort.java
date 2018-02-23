package Lecture3;

public class selectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 60, 50, 40, 30, 20, 10 };
		selectionSort(arr);
		display(arr);
	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void selectionSort(int[] arr) {	
		for (int i = 0; i < arr.length - 1; i++) {
			int min_ind = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min_ind]) {
					min_ind = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min_ind];
			arr[min_ind] = temp;
		}
	}

}
