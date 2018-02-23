package lecture4;

public class stringOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String str="Hello";
   // printAllChars(str);
   // printSS(str);
    System.out.println(toggleCase(str));
	}
public static void printAllChars(String str){
	for(int i=0;i<str.length();i++){
		System.out.println(str.charAt(i));
	}
}
public static void printSS(String str){
	for(int i=0;i<str.length();i++){
		for(int j=i+1;j<=str.length();j++){
			System.out.println(str.substring(i,j));
		}
	}
}
public static String toggleCase(String str){
	StringBuilder sb=new StringBuilder("Hello");
	
	for(int i=0;i<str.length();i++){
		if(str.charAt(i)>=97&&str.charAt(i)<=122){
			sb.setCharAt(i, (char)(str.charAt(i)-32));
		}else{
			sb.setCharAt(i, (char)(str.charAt(i)+32));
		}
	}
	return sb.toString();
}
}
