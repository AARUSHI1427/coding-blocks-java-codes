package homework;

import java.util.Scanner;

public class series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner s=new Scanner(System.in);
	      int N1=s.nextInt();
	      int N2=s.nextInt();
	      series(N1,N2);
	      
	    }
	    public static int series(int n1,int n2){
	        int term=0,n;
	        for(n=1;n<=n1;n++){
	            term=3*n+2;
	            if(term%n2==0){
	               
	            }else{
	                 System.out.println(term);
	            }
	        } 
	        return 0;
	}

}
