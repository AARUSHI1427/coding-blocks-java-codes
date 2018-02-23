package homework;

import java.util.Scanner;

public class inversearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		    int N=s.nextInt();
		    int[] arr=new int[N];
		    for(int i=0;i<N;i++){
		        arr[i]=s.nextInt();
		    }
		    arr= inverse(arr,N);
		     for(int i=0;i<arr.length;i++){
		        System.out.println(arr[i]);
		    }
		    }
		    
		    public static int[] inverse(int[] arr,int n){
		    	int[] a=new int[n];
		        for(int i=0;i<arr.length;i++){
		            a[arr[i]]=i;
		        }
		        return a;
	}

}
