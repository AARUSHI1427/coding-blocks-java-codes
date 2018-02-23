package hashmaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HAshmapdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       HashMap<String,Integer> Map= new HashMap();
       String str="aabbccdddef";
       System.out.println(MaxFeq(str));
       Set <Map.Entry<String,Integer>> entries=Map.entrySet();
       for(Map.Entry<String,Integer>entry:entries){
    	   System.out.println(entry.getKey()+"=>");
    	   System.out.println(entry.getValue());
       }
	}
   public static character MaxFeq(String str){
	     HashMap<Character,Integer> map=new HashMap<>();
	     for(int i=0;i<str.length();i++){
	    	 
	     }
   }
}
