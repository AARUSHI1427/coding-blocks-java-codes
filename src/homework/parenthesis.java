package homework;

public class parenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str="abc(xbd)";
//        String answer = str.substring(str.indexOf("(")+1,str.indexOf(")"));
//        System.out.println(answer);
        System.out.println(parenthesis(str, 0));
	}
  public static String parenthesis(String str,int i){
	  int count1=0;
	  int count2=0;
	  if(i==str.length()){
		  return "" ;
	  }
	  if(str.charAt(i)=='('||str.charAt(i)==')'){
		  if(str.charAt(i)=='('){
			  count1=str.indexOf('(');
			  parenthesis(str, i+1);
		  }else{
			  count2=str.indexOf(')');
			  parenthesis(str, i+1);
		  }
	  }else{
		  return parenthesis(str, i+1);
	  }
	  return str.substring(count1,count2);
  }
}
