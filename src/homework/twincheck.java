package homework;

import java.util.Scanner;

public class twincheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s=new Scanner(System.in);
	        String str=s.next();
	        System.out.println(twin(str,0,0));
	    }
	    public static int twin(String str,int i,int count){
	        if(i==str.length()-2){
	            return count;
	        }
	        if(str.charAt(i)==str.charAt(i+2)){
	            
	            return twin(str,i+1,count+1); 
	        }else{
	            
	            return twin(str,i+1,count);
	        }
	        
	}

}
