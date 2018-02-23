package Lecture3;

public class insertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 60, 50, 40, 30, 20, 10 };
		insertionSort(arr);
		display(arr);
	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
   public static void insertionSort(int[] arr){
	   for(int i=1;i<arr.length;i++){
		   for(int j=i;j>0 && arr[j-1]>arr[j];j--){
			   int temp=arr[j-1];
			   arr[j-1]=arr[j];
			   arr[j]=temp;
		   }
	   }
   }

}
