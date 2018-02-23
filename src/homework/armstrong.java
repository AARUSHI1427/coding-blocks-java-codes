package homework;

import java.util.Scanner;

public class armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s=new Scanner(System.in);
	       
		    int N=s.nextInt();
		    System.out.println(arm(N));
		    }
		    public static boolean arm(int N){
		        int c=0,a,temp; 
		        temp=N;  
		        while(N>0)  
		        {  
		        a=N%10;  
		        N=N/10;  
		        c=c+(a*a*a);  
		        }  
		        if(temp==c)  
		        return (true);  
		        else  
		          return (false);   
	}

}
