package Lecture1;

public class primeprint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int N=10;
       int i,j;
           for(i=2;i<N;i++){
    	   if(i/2==0){
    		   return;
    	   }else{
    		   for(j=2;j<i;j++){
    			   if(i/j==0){
    				   break;
    			   }
    			   else{
    				   System.out.println(i);
    			   }
    		   }
    	   }
       }
	}

}
