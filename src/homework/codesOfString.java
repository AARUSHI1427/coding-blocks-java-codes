package homework;

import java.util.ArrayList;
import java.util.Scanner;

public class codesOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   		Scanner s=new Scanner(System.in);
		   		String str=new String();
		   		str=s.next();
		   		System.out.println(cos(str, ""));
		   		
		   	}
		   	public static ArrayList<String> cos(String str,String result)
		   	{
		   		if(str.length()==0)
		   		{
		   			ArrayList<String> baseResult = new ArrayList<>();
		   			//baseResult.add("");
					baseResult.add(result);
					return baseResult;
		   			
		   			//arrli;
		   		}
		   		ArrayList<String> finresult = new ArrayList<>();
		   		for(int i=str.length()-1;i>=0;i--)
		   		{
		   			String newresult=str.substring(i);
		   			String ros=str.substring(0,i);
		   			StringBuilder sb=new StringBuilder();
		   			int rem=1;
		   			int chk=0;
		   		 for(int j=0;j<newresult.length();j++)
		         {
		             chk=chk+((int)newresult.charAt(newresult.length()-1-j)-48)*rem;
		             rem=rem*10;
		         }
		   		 if(chk>26||chk<1)
		   		 {
		   			 continue;
		   		 }
		   		
		   		 else
		   		 {
		   			char newchar=(char)(chk+96);
		   			ArrayList<String> recresult =cos(ros, newchar+result);
		   			for(int s=0;s<recresult.size();s++)
		   			{
		   				finresult.add(recresult.get(s));
		   			}
		   			
		   			
		   		 }
		   		 
		   		}
		   		return finresult;
					
		   	}
		   
	}


