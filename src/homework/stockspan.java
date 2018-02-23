package homework;

import java.util.Scanner;

public class stockspan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s=new Scanner(System.in);
      int N=s.nextInt();
      int[] price=new int[N];
      for(int i=0;i<N;i++){
    	  price[i]=s.nextInt();
      }
      int[] ans=new int[N];
      for(int i=0;i<N;i++){
    	  ans[i]=1;
      }

      for(int i=price.length-1;i>0;i--){
    	  if(price[i-1]<price[i]){
    		  ans[i]++;
    	  }
      }
      for(int i=0;i<ans.length;i++){
    	  System.out.print(ans[i]+" ");
      }
	}

}
