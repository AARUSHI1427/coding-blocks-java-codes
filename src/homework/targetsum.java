package homework;

import java.util.Scanner;

public class targetsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s=new Scanner(System.in);
	        int N=s.nextInt();
		    int[] arr=new int[N];
		    for(int i=0;i<N;i++){
		        arr[i]=s.nextInt();
		    }
		    int target=s.nextInt();
		    target(arr,target);
	    }
	    public static void target(int[] arr,int tar){
	        for(int i=0;i<arr.length;i++){
	            for(int j=i+1;j<arr.length-1;j++){
	                if(arr[i]+arr[j]==tar){
	                    System.out.println(arr[i]+" and "+arr[j]);
	                }
	            }
	        }
	}

}
