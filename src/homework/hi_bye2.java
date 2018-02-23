package homework;

import java.util.Scanner;

public class hi_bye2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s=new Scanner(System.in);
	      String S=s.next();
	      System.out.println(modifyStr(S,0,0));
	      System.out.println(deleteHi(S, 0));
	      System.out.println(returnBye(S, 0));
	      
	}
      public static int modifyStr(String str,int i,int count){
   	   if(i==str.length()-2){
   		   if(str.charAt(i)=='h'&&str.charAt(i+1)=='i'){
   			   return count+1;
   		   }else{
   			   return count;
   		   }
   		  
   	   }
   	  if(str.charAt(i)=='h'&&str.charAt(i+1)=='i'){
   		 
   			  return modifyStr(str, i+1, count+1);
   		  
   	  }else{
			  return modifyStr(str, i+1, count);
		  }
      }
      
      
      public static String deleteHi(String str,int i){
   	   StringBuilder sb=new StringBuilder(str);
   	   if(i==str.length()-2){
   		   if(str.charAt(i)=='h'&&str.charAt(i+1)=='i'){
   			   sb.deleteCharAt(i);
   			   sb.deleteCharAt(i);
   			   str=sb.toString();
   			   return str ;
   		   }else{
   			   return str;
   		   }
   		  
   	   }
   	   
   	  if(str.charAt(i)=='h'&&str.charAt(i+1)=='i'){
   		
   			  sb.deleteCharAt(i);
  			      sb.deleteCharAt(i);
   			  str=sb.toString();
   			  return deleteHi(str, i);
   		  
   	  }else{
			  return deleteHi(str, i+1);
		  }
      }
      
      
      public static String returnBye(String str,int i){
   	   StringBuilder sb=new StringBuilder(str);
   	   if(i==str.length()-2){
   		   if(str.charAt(i)=='h'&&str.charAt(i+1)=='i'){
   			   sb.deleteCharAt(i);
   			   sb.deleteCharAt(i);
   			   sb.insert(i, "bye");
   			   str=sb.toString();
   			   return str ;
   		   }else{
   			   return str;
   		   }
   		  
   	   }
   	   
   	  if(str.charAt(i)=='h'&&str.charAt(i+1)=='i'){
   		 
   			  sb.deleteCharAt(i);
  			      sb.deleteCharAt(i);
  			      sb.insert(i, "bye");
   			  str=sb.toString();
   			  return returnBye(str, i);
   		  
   	  }else{
			  return returnBye(str, i+1);
		  }
	}

}
