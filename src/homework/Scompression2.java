package homework;

import java.util.Scanner;

public class Scompression2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s=new Scanner(System.in);
      String S=s.next();
      StringBuilder sb=new StringBuilder();

      for(int i=0;i<S.length()-1;i++){
    	  if(S.charAt(i)!=S.charAt(i+1)){
    		  sb.append(S.charAt(i));
    		  System.out.println(sb);
    	  }
      }
      sb.append(S.charAt(S.length()-1));
      System.out.println(sb);
      
      for(int j=0;j<sb.length();j++){
    	  int count=0;
    	  for(int k=0;k<S.length();k++){
    		  if(S.charAt(k)==sb.charAt(j)){
    			  count++;
    			  if(count==1){
    				  
    			  }else{
    				  sb.insert(j+1, count);  
    			  }
    			  
    		  }
    		   
    	  }
    	  
		  System.out.println(sb);
      }
	}

}
