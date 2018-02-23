package homework;
//Take as input S, a string. Write a function that returns the character with maximum frequency. Print the value returned.
//
//
//Input Format:
//String
//
//Constraints:
//A string of length between 1 to 1000.
//Output Format:
//character
//
//Sample Input:
//aaabacb
//Sample Output:
//a

import java.util.Scanner;

public class maxFreq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s=new Scanner(System.in);
	        String S=s.next();
	        if(S.length()==0){
	            return;
	        }
	        int[] arr=new int[256];
	        for(int i=0;i<arr.length;i++){
	        	arr[i]=0;
	        }
	        for(int i = 0;i<S.length();  i++){
	            arr[(int)(S.charAt(i))]++;
	        }
	        int max=0;
	        for(int i=0;i<arr.length;i++){
	            if(arr[i]>arr[max]){
	                max=i;
	                
	            }
	        }
	        System.out.println((char)(max));
	       
	}

}
