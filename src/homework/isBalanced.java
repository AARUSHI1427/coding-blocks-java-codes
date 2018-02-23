package homework;

import java.util.Scanner;

public class isBalanced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s=new Scanner(System.in);
	        String str=s.next();
	        System.out.println(isBalanced1(str,0,0));
	    }
	    public static boolean isBalanced1(String str,int i,int count){
	        
	        if(i==str.length()){
	            return true;
	        }
	    
	        if(str.charAt(i)=='('||str.charAt(i)=='{'||str.charAt(i)=='['){
	        	System.out.println(str.charAt(i));
	            count=count++;
		            } else if (str.charAt(i) == ')'||str.charAt(i)=='}'||str.charAt(i)==']') {
		                if (count == 0){
		                	System.out.println(str.charAt(i));
	                        return false;
		                }else{
		                	System.out.println(str.charAt(i));
		                    count=count--;
		                    }
		            }
	        
	        isBalanced1(str,i+1,count);
	        if(count != 0) {
	            return false;
	        }else{
	        	   return true;
	        }
		     
	    }
	}


