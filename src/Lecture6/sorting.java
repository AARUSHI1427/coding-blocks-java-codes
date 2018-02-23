package Lecture6;

public class sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int[] one={1,7,8,9,15};
		// int[] two={2,10,18,24};
		// int[] ans=merge(one,two);
		// for(int i=0;i<ans.length;i++){
		// System.out.println(ans[i]);
		// }
		int[] arr = { 6, 1, 4, 3, 7, 2 };
//		int[] ans = mergeSort(arr, 0, arr.length - 1);
//		for (int i = 0; i < ans.length; i++) {
//			System.out.println(ans[i]);
//		}
         quickSort(arr,0,arr.length-1);
         for(int i=0;i<arr.length;i++){
 			System.out.println(arr[i]);
 		}
		

	}

	public static int[] mergeSort(int[] arr, int low, int high) {
        if(low==high){
        	int[] arr1=new int[1];
        	arr1[0]=arr[low];
        	return arr1;
        }
		int mid = (low + high) / 2;
		int[] left = mergeSort(arr, low, mid);
		int[] right = mergeSort(arr, mid + 1, high);

		int[] ans = merge(left, right);

		return ans;

	}

	public static int[] merge(int[] one, int[] two) {
		int[] ans = new int[one.length + two.length];
		int i = 0, j = 0, k = 0;
		while (i < one.length && j < two.length) {

			if (one[i] <= two[j]) {
				ans[k] = one[i];
				i++;
				k++;
			} else {
				ans[k] = two[j];
				j++;
				k++;
			}
		}

		while (i < one.length) {
			ans[k] = one[i];
			i++;
			k++;
		}
		while (j < two.length) {
			ans[k] = two[j];
			j++;
			k++;
		}
		return ans;
	}
	public static void quickSort(int[] arr,int low,int high){
		int left=0,right=arr.length-1;
		int mid=(low+high)/2;
		int pivot=arr[mid];
		if(low>=high){
			return;
		}
		while(left<=right){
			while(arr[left]<pivot){
				left++;			
			}
			while(arr[right]>pivot){
				right--;
			}
			if(left<=right){
				int temp=arr[left];
				arr[left]=arr[right];
				arr[right]=temp;
				left++;
				right--;
			}
		
		}
		quickSort(arr,low,right);
		quickSort(arr,left,high);
		
		
	}
}
