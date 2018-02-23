package homework;

import java.util.Scanner;

class checking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 Scanner s=new Scanner(System.in);
//	        int N=s.nextInt();
//	        System.out.println(findTri(N));
//	    }
//	    public static int findTri(int n){
//	    	if(n==0){
//	    		return 0;
//	    	}
//	        int sum=0;
//	        
//	        sum=sum+findTri(n-1);
//	        return findTri(n-1);
		/*Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int[] arr=new int[N];
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        
        System.out.println(isPalind(arr,0,N-1));
    }
    public static boolean isPalind(int[] arr,int i,int j){
        if(i>=j){
            return true;
        }
        if(arr[i]==arr[j]){
            isPalind(arr,i+1,j-1);
            return true;
            
        }else{
            return false;
        }*/
//        Scanner s=new Scanner(System.in);
//       int N=s.nextInt();
//       int[] arr=new int[N];
//       for(int i=0;i<arr.length;i++){
//           arr[i]=s.nextInt();
//       }
//       selectionSort(arr,N);
//        for(int i=0;i<arr.length;i++){
//           System.out.print(arr[i]+" "); 
//       }
//   }
//   public static void selectionSort(int[] arr,int n){
//       
//       if(n==1){
//           return;
//       }
//       for(int i=0;i<arr.length-1;i++){
//           int min=i;
//           if(arr[i+1]<arr[min]){
//               min=i+1;
//           }
//           int temp=arr[i+1];
//           arr[i+1]=arr[min];
//           arr[min]=temp; 
//       }
//      selectionSort(arr,n-1); 
		 Scanner s=new Scanner(System.in);
	        String str=s.next();
	        System.out.println(dupli(str,0));
	    }
	    public static String dupli(String str,int i){
	    	 StringBuilder sb=new StringBuilder(str);
	    	if(i==str.length()-1){
	            return str;
	        }
	       
	        if(str.charAt(i)==str.charAt(i+1)){
	            sb.insert(i+1,"*");
	            
	            str=sb.toString();
	            return dupli(str,i+1);
	            
	            
	          
	        }else{
	            
	        	return dupli(str,i+1);
	           
	           
	        }
	        
	}

}


//Scanner s=new Scanner(System.in);
//int N=s.nextInt();
//int[] arr=new int[N];
//for(int i=0;i<arr.length;i++){
//    arr[i]=s.nextInt();
//}
//System.out.println(isSorted(arr,0));
//
//}
//public static boolean isSorted(int[] arr,int si){
//if(si==arr.length-1){
//    return true;
//}
//if(arr[si]>arr[si+1]){
//    return false;
//}else{
//    isSorted(arr,si+1);
//}