package homework;

import java.util.Scanner;

public class obedientStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner s=new Scanner(System.in);
     String str=s.next();
     System.out.println(obedient(str,0));
	}
	public static boolean obedient(String str,int i){
		if(i==str.length()){
			return true;
		}
		char cc= str.charAt(0);
		String ros= str.substring(1);
		if(cc=='a'){
			if(cc==str.charAt(str.length()-1)||str.substring(i+1, i+3)=="bb"){
		        if(i==str.length()-1){
		        	return true;
		        }else{
		        	if(str.charAt(i+2)==str.charAt(str.length()-1)||str.charAt(i+3)=='a'){
		        		
		        		return obedient(ros,i);
		        	}else{
		        		return false;
		        	}
		        }
			
			}
         }else{
        	 return obedient(ros, i); 
         }
		return false;
	

		
	}
}
