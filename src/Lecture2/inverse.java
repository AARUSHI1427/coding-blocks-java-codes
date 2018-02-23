package Lecture2;

public class inverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int num=3214;
      int i=1,rem,sum=0,pow=1;
      while(num!=0){
    	  pow=1;
    	  rem=num%10;
    	  
    	  while(rem!=1){
    		  pow=pow*10;
    		  rem--;
    	  }
    	  sum=sum+i*pow;
    	  i++;
    	  num=num/10;
      }
      System.out.println(sum);
	}
	

}
