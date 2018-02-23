package lecture5;

public class recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println(fact(5));
		//System.out.println(power(2, 5));
		//System.out.println(fib(5));
		int[] arr={8,10,12,4,12,12,20};
		//System.out.println(firstInd(arr,0,12));
		System.out.println(lastInd(arr,0,12));
		//int[] result=allindices(arr,0,12);
//		for(int i=0;i<result.length;i++){
//			System.out.println(result[i]);
//		}
		//pattern(5,1,1);
	}

	public static int fact(int n) {
		if (n == 0) {
			return 1;
		}
		int fnm1 = fact(n - 1);
		int fn = n * fnm1;
		return fn;
	}

	public static int power(int base, int p) {
		if (p == 0) {
			return 1;
		}
		int result = power(base, p - 1);
		int r = result * base;

		return r;
	}

	public static int fib(int n) {
		if(n==0||n==1){
			return n;
		}
		
		
		int fibn=fib(n-1)+fib(n-2);
		return fibn;
	}
	public static boolean isSorted(int[] arr,int si){
		if(si==arr.length-1){
			return true;
		}
		if(arr[si]>arr[si+1]){
			return false;
			
		}else{
			return isSorted(arr,si+1);
		}
	}
	public static int firstInd(int[] arr,int si,int num){
		if(si==arr.length){
			return -1;
		}
		if(arr[si]==num){
			return si;
		}else{
			return firstInd(arr,si+1,num);
		}
	}
	public static int lastInd(int[] arr,int si,int num){
		if(si==arr.length){
			return -1;
		}
		int index=lastInd(arr,si+1,num);
		if (index != -1) {
			return index;
		} else {
			if (arr[si] == num) {
				return si;
			} else {
				return -1;
			}
		}
			
		}
//	public static int[] allindices(int[] arr,int si,int num){
//		int[] a={};
//		if(si==arr.length){
//			return a;
//		}
//		int i=0;
//		if(arr[si]==num){
//		
//		i++;
//		return a;
//		}else{
//			allindices(arr,si+1,num);
//			return a;
//		}
//		
//	}
	public static void pattern(int N,int row,int col){
		if(col==N+1||row==N){
			return;
		}
		System.out.print("*");
		pattern(N,row,col+1);
		System.out.println();
		pattern(N,row+1,col);
	}
			
	}

