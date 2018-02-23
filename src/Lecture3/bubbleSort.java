package Lecture3;

public class bubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int arr[]={50,40,30,20,10};
   bubbleSort(arr);
   display(arr);
	}
	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	public static void bubbleSort(int[] arr){
		for(int i=1;i<arr.length;i++){
			for(int j=0;j<arr.length-i;j++){
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
}
