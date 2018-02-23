package homework;

import java.util.ArrayList;
import java.util.Scanner;

public class intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
	    int N=s.nextInt();
	    int[] arr1=new int[N];
	    for(int i=0;i<N;i++){
	        arr1[i]=s.nextInt();
	    }
	     int[] arr2=new int[N];
	    for(int i=0;i<N;i++){
	        arr2[i]=s.nextInt();
	    }
	    ArrayList<Integer> list=new ArrayList<>();
	    list= intersection(arr1,arr2);
	    System.out.println(list);
	    }
	    public static ArrayList<Integer> intersection(int[] arr1,int[] arr2){
	         ArrayList<Integer> list=new ArrayList<>();
	        for(int i=0;i<arr1.length;i++){
	            for(int j=0;j<arr2.length;j++){
	                if(arr2[j]==arr1[i]){
	                    list.add(arr2[j]);
	                }
	            }
	        }
	        return list;
	}

}
