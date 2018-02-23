package homework;

import java.util.Scanner;

public class targetSum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
        int N=s.nextInt();
	    int[] arr=new int[N];
	    for(int i=0;i<N;i++){
	        arr[i]=s.nextInt();
	    }
	    int target=s.nextInt();
	    int[] ans= mergeSort(arr, 0, arr.length-1);
	    targetSum(ans,target);
	    
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
	public static void targetSum(int[] arr,int tar){
		
		int left=0,right=arr.length-1;
		while(left<=right){
		int mysum=arr[left]+arr[right];
		if(mysum==tar){
			System.out.println(arr[left]+" and "+arr[right]);
			left++;
			right--;
		}else{
		if(mysum>tar){
			right--;
		}else{
			left++;
		}
		 }
		}
	}

}
