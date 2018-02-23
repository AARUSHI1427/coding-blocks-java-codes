package Lecture1;

import java.util.Scanner;

public class kuchbhi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 int N;
//	        Scanner s= new Scanner(System.in);
//	        N=s.nextInt();
//	       
//	        int a=0;
//	        int b=1;
//	        int c=0,i=1;
//	        while(i<N){
//	            c=a+b;
//	            System.out.println(a);
//	            a=b;
//	            b=c;
//	            i++;
//	          }  }
//	        
//	}Scanner s=new Scanner(System.in);
//    int N=s.nextInt();
//    int[] arr=new int[N];
//    for(int i=0;i<N;i++){
//        arr[i]=s.nextInt();
//    }
//    if(si==arr.length){
//		if(arr[si]==num){
//			return si;
//		}else{
//			return lastInd(arr,si-1,num);
//		}
//	}
//	lastInd(arr,si+1,num);
//	return -1;
	
//	        Scanner s=new Scanner(System.in);
//	        int N=s.nextInt();
//	        patternStar(N,0,1);
//	    }
//	    public static void patternStar(int n,int row,int col){
//	        if(row>n){
//	            return;
//	            System.out.println();
//	        }
//	        if(col>n-row){
//	            System.out.println();
//	            patternStar(n,row+1,col);
//	            return;
//	        }
//	        System.out.print("*\t");
//	        patternStar(n,row,col+1);
		 Scanner s=new Scanner(System.in);
	        int N=s.nextInt();
	        System.out.println(findTri(N));
	    }
	    public static int findTri(int n){
	        int sum=0;
	        int a=findTri(n-1);
	        sum=sum+a;
	        return sum;
	    }
	}

